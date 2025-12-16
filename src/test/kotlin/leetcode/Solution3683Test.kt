package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3683Test {

    @Test
    fun test1() {
        // Given
        val expected = 5

        // When
        val actual = Solution3683().earliestTime(tasks = arrayOf(intArrayOf(1, 6), intArrayOf(2, 3)))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 200

        // When
        val actual = Solution3683().earliestTime(
            tasks = arrayOf(intArrayOf(100, 100), intArrayOf(100, 100), intArrayOf(100, 100))
        )

        // Then
        assertEquals(expected, actual)
    }
}
