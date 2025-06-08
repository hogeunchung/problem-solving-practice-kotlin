package leetcode

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class _492__Construct_the_RectangleKtTest {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(37, 1)

        // When
        val actual = constructRectangle(area = 37)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(427, 286)

        // When
        val actual = constructRectangle(area = 122122)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(2, 1)

        // When
        val actual = constructRectangle(area = 2)

        // Then
        assertArrayEquals(expected, actual)
    }
}
