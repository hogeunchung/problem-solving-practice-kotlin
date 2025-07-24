package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _448__Find_All_Numbers_Disappeared_in_an_ArrayTest {

    @Test
    fun test1() {
        // Given
        val expected = listOf(5, 6)

        // When
        val actual = findDisappearedNumbers(nums = intArrayOf(4, 3, 2, 7, 8, 2, 3, 1))

        // Then
        assertArrayEquals(expected.toTypedArray(), actual.toTypedArray())
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(2)

        // When
        val actual = findDisappearedNumbers(nums = intArrayOf(1, 1))

        // Then
        assertArrayEquals(expected.toTypedArray(), actual.toTypedArray())
    }
}
