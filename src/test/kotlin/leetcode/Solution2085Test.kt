package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2085Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution2085().countWords(
            words1 = arrayOf("leetcode", "is", "amazing", "as", "is"),
            words2 = arrayOf("amazing", "leetcode", "is"),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution2085().countWords(
            words1 = arrayOf("b", "bb", "bbb"),
            words2 = arrayOf("a", "aa", "aaa"),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 1

        // When
        val actual = Solution2085().countWords(
            words1 = arrayOf("a", "ab"),
            words2 = arrayOf("a", "a", "a", "ab"),
        )

        // Then
        assertEquals(expected, actual)
    }
}
