package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2418Test {

    @Test
    fun test1() {
        // Given
        val expected = arrayOf("Mary", "Emma", "John")

        // When
        val actual =
            Solution2418().sortPeople(names = arrayOf("Mary", "John", "Emma"), heights = intArrayOf(180, 165, 170))

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = arrayOf("Bob", "Alice", "Bob")

        // When
        val actual =
            Solution2418().sortPeople(names = arrayOf("Alice", "Bob", "Bob"), heights = intArrayOf(155, 185, 150))

        // Then
        assertArrayEquals(expected, actual)
    }
}
