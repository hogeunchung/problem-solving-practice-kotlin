package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution1189Test {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = Solution1189().maxNumberOfBalloons(text = "nlaebolko")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = Solution1189().maxNumberOfBalloons(text = "loonbalxballpoon")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = Solution1189().maxNumberOfBalloons(text = "leetcode")

        // Then
        assertEquals(expected, actual)
    }
}
