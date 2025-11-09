package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1518Test {

    @Test
    fun test1() {
        // Given
        val expected = 13

        // When
        val actual = Solution1518().numWaterBottles(numBottles = 9, numExchange = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 19

        // When
        val actual = Solution1518().numWaterBottles(numBottles = 15, numExchange = 4)

        // Then
        assertEquals(expected, actual)
    }
}
