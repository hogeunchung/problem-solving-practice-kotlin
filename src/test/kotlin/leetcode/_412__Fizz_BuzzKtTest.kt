package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _412__Fizz_BuzzKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = listOf("1", "2", "Fizz")

        // Act
        val actual = fizzBuzz(n = 3)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = listOf("1", "2", "Fizz", "4", "Buzz")

        // Act
        val actual = fizzBuzz(n = 5)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
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

        // Act
        val actual = fizzBuzz(n = 15)

        // Assert
        assertEquals(expected, actual)
    }
}
