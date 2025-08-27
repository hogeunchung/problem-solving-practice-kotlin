package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _905__Sort_Array_By_ParityTest {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(2, 4, 3, 1)

        // When
        val actual = sortArrayByParity(nums = intArrayOf(3, 1, 2, 4))

        // Then
        assertArrayEquals(expected.take(2).sorted().toTypedArray(), actual.take(2).sorted().toTypedArray())
        assertArrayEquals(expected.takeLast(2).sorted().toTypedArray(), actual.takeLast(2).sorted().toTypedArray())
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(0)

        // When
        val actual = sortArrayByParity(nums = intArrayOf(0))

        // Then
        assertArrayEquals(expected, actual)
    }
}
