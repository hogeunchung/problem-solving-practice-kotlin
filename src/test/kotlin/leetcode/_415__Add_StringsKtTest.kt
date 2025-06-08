package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _415__Add_StringsKtTest {

    @Test
    fun test1() {
        // Given
        val expected = "134"

        // When
        val actual = addStrings(
            num1 = "11",
            num2 = "123"
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "533"

        // When
        val actual = addStrings(
            num1 = "456",
            num2 = "77"
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = "0"

        // When
        val actual = addStrings(
            num1 = "0",
            num2 = "0"
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = "10"

        // When
        val actual = addStrings(
            num1 = "1",
            num2 = "9"
        )

        // Then
        assertEquals(expected, actual)
    }
}
