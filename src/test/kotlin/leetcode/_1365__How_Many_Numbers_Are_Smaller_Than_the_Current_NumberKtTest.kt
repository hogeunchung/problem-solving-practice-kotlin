package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _1365__How_Many_Numbers_Are_Smaller_Than_the_Current_NumberKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = intArrayOf(4, 0, 1, 1, 3)

        // Act
        val actual = smallerNumbersThanCurrent(nums = intArrayOf(8, 1, 2, 2, 3))

        // Assert
        (expected.indices).map { assertEquals(expected[it], actual[it]) }
    }

    @Test
    fun test2() {
        // Arrange
        val expected = intArrayOf(2, 1, 0, 3)

        // Act
        val actual = smallerNumbersThanCurrent(nums = intArrayOf(6, 5, 4, 8))

        // Assert
        (expected.indices).map { assertEquals(expected[it], actual[it]) }
    }

    @Test
    fun test3() {
        // Arrange
        val expected = intArrayOf(0, 0, 0, 0)

        // Act
        val actual = smallerNumbersThanCurrent(nums = intArrayOf(7, 7, 7, 7))

        // Assert
        (expected.indices).map { assertEquals(expected[it], actual[it]) }
    }
}
