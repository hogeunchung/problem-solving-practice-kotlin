package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2696Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution2696().minLength(s = "ABFCACDB")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 5

        // When
        val actual = Solution2696().minLength(s = "ACBBD")

        // Then
        assertEquals(expected, actual)
    }
}
