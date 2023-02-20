package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _228__Summary_RangesKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = listOf("0->2", "4->5", "7")

        // Act
        val actual = summaryRanges(nums = intArrayOf(0, 1, 2, 4, 5, 7))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = listOf("0", "2->4", "6", "8->9")

        // Act
        val actual = summaryRanges(nums = intArrayOf(0, 2, 3, 4, 6, 8, 9))

        // Assert
        assertEquals(expected, actual)
    }
}
