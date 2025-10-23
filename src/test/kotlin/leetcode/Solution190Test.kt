package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution190Test {

    @Test
    fun test1() {
        // Given
        val expected = 964176192

        // When
        val actual = Solution190().reverseBits(n = 43261596)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1073741822

        // When
        val actual = Solution190().reverseBits(n = 2147483644)

        // Then
        assertEquals(expected, actual)
    }
}
