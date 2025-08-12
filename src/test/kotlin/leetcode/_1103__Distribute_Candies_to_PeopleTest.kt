package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1103__Distribute_Candies_to_PeopleTest {

    @Test
    fun test1() {
        // Given
        val expected = intArrayOf(1, 2, 3, 1)

        // When
        val actual = distributeCandies(candies = 7, num_people = 4)

        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = intArrayOf(5, 2, 3)

        // When
        val actual = distributeCandies(candies = 10, num_people = 3)

        // Then
        assertArrayEquals(expected, actual)
    }
}
