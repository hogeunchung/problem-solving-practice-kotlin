package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _96__Unique_Binary_Search_TreesTest {

    @Test
    fun test1() {
        // Given
        val expected = 5

        // When
        val actual = numTrees(n = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1

        // When
        val actual = numTrees(n = 1)

        // Then
        assertEquals(expected, actual)
    }
}
