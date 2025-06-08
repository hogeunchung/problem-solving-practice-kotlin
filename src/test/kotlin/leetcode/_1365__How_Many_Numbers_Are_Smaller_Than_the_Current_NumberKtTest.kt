package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _1365__How_Many_Numbers_Are_Smaller_Than_the_Current_NumberKtTest {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(4, 0, 1, 1, 3)

        // When
        val actual = smallerNumbersThanCurrent(nums = intArrayOf(8, 1, 2, 2, 3))

        // Then
        (expected.indices).map { assertEquals(expected[it], actual[it]) }
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(2, 1, 0, 3)

        // When
        val actual = smallerNumbersThanCurrent(nums = intArrayOf(6, 5, 4, 8))

        // Then
        (expected.indices).map { assertEquals(expected[it], actual[it]) }
    }

    @Test
    fun test3() {
        // Given
        val expected = intArrayOf(0, 0, 0, 0)

        // When
        val actual = smallerNumbersThanCurrent(nums = intArrayOf(7, 7, 7, 7))

        // Then
        (expected.indices).map { assertEquals(expected[it], actual[it]) }
    }
}
