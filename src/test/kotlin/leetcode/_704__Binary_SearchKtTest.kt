package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _704__Binary_SearchKtTest {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = leetcode.search(intArrayOf(-1, 0, 3, 5, 9, 12), 9)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = -1

        // When
        val actual = leetcode.search(intArrayOf(-1, 0, 3, 5, 9, 12), 2)

        // Then
        assertEquals(expected, actual)
    }
}
