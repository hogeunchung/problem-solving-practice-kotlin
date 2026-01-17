package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2651Test {

    @Test
    fun test1() {
        // Given
        val expected = 20

        // When
        val actual = Solution2651().findDelayedArrivalTime(arrivalTime = 15, delayedTime = 5)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 0

        // When
        val actual = Solution2651().findDelayedArrivalTime(arrivalTime = 13, delayedTime = 11)

        // Then
        assertEquals(expected, actual)
    }
}
