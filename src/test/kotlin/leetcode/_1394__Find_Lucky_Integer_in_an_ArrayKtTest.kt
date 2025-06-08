package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _1394__Find_Lucky_Integer_in_an_ArrayKtTest {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = findLucky(intArrayOf(2, 2, 3, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 3

        // When
        val actual = findLucky(intArrayOf(1, 2, 2, 3, 3, 3))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = -1

        // When
        val actual = findLucky(intArrayOf(2, 2, 2, 3, 3))

        // Then
        assertEquals(expected, actual)
    }
}
