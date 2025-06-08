package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _287__Find_the_Duplicate_NumberKtTest {

    @Test
    fun test1() {
        // Given
        val expected = 2
        // When
        val actual = findDuplicate(intArrayOf(1, 3, 4, 2, 2))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 3
        // When
        val actual = findDuplicate(intArrayOf(3, 1, 3, 4, 2))

        // Then
        assertEquals(expected, actual)
    }
}
