package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _62__Unique_PathsTest {

    @Test
    fun test1() {
        // Given
        val expected = 28

        // When
        val actual = uniquePaths(m = 3, n = 7)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 3

        // When
        val actual = uniquePaths(m = 3, n = 2)

        // Then
        assertEquals(expected, actual)
    }
}
