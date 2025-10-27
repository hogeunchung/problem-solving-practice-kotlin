package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1360Test {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = Solution1360().daysBetweenDates(date1 = "2019-06-29", date2 = "2019-06-30")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 15

        // When
        val actual = Solution1360().daysBetweenDates(date1 = "2020-01-15", date2 = "2019-12-31")

        // Then
        assertEquals(expected, actual)
    }
}
