package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _45__Jump_Game_IITest {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = jump(intArrayOf(2, 3, 1, 1, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = jump(intArrayOf(2, 3, 0, 1, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = jump(intArrayOf(0))

        // Then
        assertEquals(expected, actual)
    }
}
