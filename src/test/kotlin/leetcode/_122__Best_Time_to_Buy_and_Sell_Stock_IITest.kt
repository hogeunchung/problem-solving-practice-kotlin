package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _122__Best_Time_to_Buy_and_Sell_Stock_IITest {

    @Test
    fun test1() {
        // Given
        val expected = 7

        // When
        val actual = maxProfit(prices = intArrayOf(7, 1, 5, 3, 6, 4))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 4

        // When
        val actual = maxProfit(prices = intArrayOf(1, 2, 3, 4, 5))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = maxProfit(prices = intArrayOf(7, 6, 4, 3, 1))

        // Then
        assertEquals(expected, actual)
    }
}
