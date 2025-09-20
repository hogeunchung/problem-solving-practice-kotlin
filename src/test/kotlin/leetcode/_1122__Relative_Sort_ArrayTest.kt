package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1122__Relative_Sort_ArrayTest {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19)

        // When
        val actual = relativeSortArray(
            arr1 = intArrayOf(2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19),
            arr2 = intArrayOf(2, 1, 4, 3, 9, 6),
        )

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(22, 28, 8, 6, 17, 44)

        // When
        val actual = relativeSortArray(
            arr1 = intArrayOf(28, 6, 22, 8, 44, 17),
            arr2 = intArrayOf(22, 28, 8, 6),
        )

        // Then
        assertArrayEquals(expected, actual)
    }
}
