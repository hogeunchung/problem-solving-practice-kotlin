package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1952__Three_DivisorsTest {

    @Test
    fun test1() {
        // Given
        val expected = false

        // When
        val actual = isThree(n = 2)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = true

        // When
        val actual = isThree(n = 4)

        // Then
        assertEquals(expected, actual)
    }
}
