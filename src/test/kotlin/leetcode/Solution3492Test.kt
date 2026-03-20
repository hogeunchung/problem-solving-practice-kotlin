package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3492Test {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = Solution3492().maxContainers(n = 2, w = 3, maxWeight = 15)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 4

        // When
        val actual = Solution3492().maxContainers(n = 3, w = 5, maxWeight = 20)

        // Then
        assertEquals(expected, actual)
    }
}
