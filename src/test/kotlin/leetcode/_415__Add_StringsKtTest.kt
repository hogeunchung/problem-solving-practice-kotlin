package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _415__Add_StringsKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = "134"

        // Act
        val actual = addStrings(
            num1 = "11",
            num2 = "123"
        )

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = "533"

        // Act
        val actual = addStrings(
            num1 = "456",
            num2 = "77"
        )

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = "0"

        // Act
        val actual = addStrings(
            num1 = "0",
            num2 = "0"
        )

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Arrange
        val expected = "10"

        // Act
        val actual = addStrings(
            num1 = "1",
            num2 = "9"
        )

        // Assert
        assertEquals(expected, actual)
    }
}
