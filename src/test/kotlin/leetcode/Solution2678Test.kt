package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2678Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution2678().countSeniors(
            details = arrayOf("7868190130M7522", "5303914400F9211", "9273338290F4010"),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual =
            Solution2678().countSeniors(
                details = arrayOf("1313579440F2036", "2921522980M5644"),
            )

        // Then
        assertEquals(expected, actual)
    }
}
