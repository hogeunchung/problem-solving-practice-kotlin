package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2053Test {

    @Test
    fun test1() {
        // Given
        val expected = "a"

        // When
        val actual = Solution2053().kthDistinct(arr = arrayOf("d", "b", "c", "b", "c", "a"), k = 2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "aaa"

        // When
        val actual = Solution2053().kthDistinct(arr = arrayOf("aaa", "aa", "a"), k = 1)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = ""

        // When
        val actual = Solution2053().kthDistinct(arr = arrayOf("a", "b", "a"), k = 3)

        // Then
        assertEquals(expected, actual)
    }
}
