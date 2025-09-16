package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1903__Largest_Odd_Number_in_StringTest {

    @Test
    fun test1() {
        // Given
        val expected = "5"

        // When
        val actual = largestOddNumber(num = "52")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = ""

        // When
        val actual = largestOddNumber(num = "4206")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = "35427"

        // When
        val actual = largestOddNumber(num = "35427")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = "7542351161"

        // When
        val actual = largestOddNumber(num = "7542351161")

        // Then
        assertEquals(expected, actual)
    }
}
