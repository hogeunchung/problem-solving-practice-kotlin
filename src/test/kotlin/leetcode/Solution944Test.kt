package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution944Test {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = Solution944().minDeletionSize(strs = arrayOf("cba", "daf", "ghi"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution944().minDeletionSize(strs = arrayOf("a", "b"))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 3

        // When
        val actual = Solution944().minDeletionSize(strs = arrayOf("zyx", "wvu", "tsr"))

        // Then
        assertEquals(expected, actual)
    }
}
