package leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class _492__Construct_the_RectangleKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = intArrayOf(37, 1)

        // Act
        val actual = constructRectangle(area = 37)

        // Assert
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = intArrayOf(427, 286)

        // Act
        val actual = constructRectangle(area = 122122)

        // Assert
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = intArrayOf(2, 1)

        // Act
        val actual = constructRectangle(area = 2)

        // Assert
        assertArrayEquals(expected, actual)
    }
}
