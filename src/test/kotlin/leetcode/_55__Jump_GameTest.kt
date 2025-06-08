package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _55__Jump_GameTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = canJump(intArrayOf(2, 3, 1, 1, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = canJump(intArrayOf(3, 2, 1, 0, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = true

        // When
        val actual = canJump(intArrayOf(2, 0))

        // Then
        assertEquals(expected, actual)
    }
}
