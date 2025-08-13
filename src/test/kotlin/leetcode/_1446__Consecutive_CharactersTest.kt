package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1446__Consecutive_CharactersTest {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = maxPower(s = "leetcode")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 5

        // When
        val actual = maxPower(s = "abbcccddddeeeeedcba")

        // Then
        assertEquals(expected, actual)
    }
}
