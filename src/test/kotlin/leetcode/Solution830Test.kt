package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution830Test {

    @Test
    fun test1() {
        // Given
        val expected = listOf(
            listOf(3, 6),
        )

        // When
        val actual = Solution830().largeGroupPositions(s = "abbxxxxzzy")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = emptyList<List<Int>>()

        // When
        val actual = Solution830().largeGroupPositions(s = "abc")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = listOf(
            listOf(3, 5),
            listOf(6, 9),
            listOf(12, 14),
        )

        // When
        val actual = Solution830().largeGroupPositions(s = "abcdddeeeeaabbbcd")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = listOf(
            listOf(0, 2),
        )

        // When
        val actual = Solution830().largeGroupPositions(s = "aaa")

        // Then
        assertEquals(expected, actual)
    }
}
