package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class _1342__Number_of_Steps_to_Reduce_a_Number_to_ZeroTest {

    @Test
    fun test1() {
        // Given
        val expected = 6

        // When
        val actual = numberOfSteps(num = 14)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 4

        // When
        val actual = numberOfSteps(num = 8)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = 12

        // When
        val actual = numberOfSteps(num = 123)

        // Then
        assertEquals(expected, actual)
    }

}
