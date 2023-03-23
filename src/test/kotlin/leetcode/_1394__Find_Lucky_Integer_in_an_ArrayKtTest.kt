package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _1394__Find_Lucky_Integer_in_an_ArrayKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 2

        // Act
        val actual = findLucky(intArrayOf(2, 2, 3, 4))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 3

        // Act
        val actual = findLucky(intArrayOf(1, 2, 2, 3, 3, 3))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = -1

        // Act
        val actual = findLucky(intArrayOf(2, 2, 2, 3, 3))

        // Assert
        assertEquals(expected, actual)
    }
}
