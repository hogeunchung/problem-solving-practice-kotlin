package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1399__Count_Largest_GroupTest {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = countLargestGroup(n = 13)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = countLargestGroup(n = 2)

        // Then
        assertEquals(expected, actual)
    }
}
