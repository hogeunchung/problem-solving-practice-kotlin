package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _412__Fizz_BuzzKtTest {

    @Test
    fun test1() {
        // Given
        val expected = listOf("1", "2", "Fizz")

        // When
        val actual = fizzBuzz(n = 3)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf("1", "2", "Fizz", "4", "Buzz")

        // When
        val actual = fizzBuzz(n = 5)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = listOf(
            "1",
            "2",
            "Fizz",
            "4",
            "Buzz",
            "Fizz",
            "7",
            "8",
            "Fizz",
            "Buzz",
            "11",
            "Fizz",
            "13",
            "14",
            "FizzBuzz"
        )

        // When
        val actual = fizzBuzz(n = 15)

        // Then
        assertEquals(expected, actual)
    }
}
