package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2129Test {

    @Test
    fun test1() {
        // Given
        val expected = "Capitalize The Title"

        // When
        val actual = Solution2129().capitalizeTitle(title = "capiTalIze tHe titLe")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "First Letter of Each Word"

        // When
        val actual = Solution2129().capitalizeTitle(title = "First leTTeR of EACH Word")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = "i Love Leetcode"

        // When
        val actual = Solution2129().capitalizeTitle(title = "i lOve leetcode")

        // Then
        assertEquals(expected, actual)
    }
}
