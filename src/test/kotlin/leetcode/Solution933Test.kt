package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution933Test {

    @Test
    fun test1() {
        // Given
        val recentCounter = Solution933.RecentCounter()

        // When & Then
        assertEquals(1, recentCounter.ping(1))
        assertEquals(2, recentCounter.ping(100))
        assertEquals(3, recentCounter.ping(3001))
        assertEquals(3, recentCounter.ping(3002))
    }
}
