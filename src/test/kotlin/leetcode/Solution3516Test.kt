package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution3516Test {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = Solution3516().findClosest(x = 2, y = 7, z = 4)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = Solution3516().findClosest(x = 2, y = 5, z = 6)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 0

        // When
        val actual = Solution3516().findClosest(x = 1, y = 5, z = 3)

        // Then
        assertEquals(expected, actual)
    }
}
