package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _657__Robot_Return_to_OriginTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = judgeCircle(moves = "UD")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = judgeCircle(moves = "LL")

        // Then
        assertEquals(expected, actual)
    }
}
