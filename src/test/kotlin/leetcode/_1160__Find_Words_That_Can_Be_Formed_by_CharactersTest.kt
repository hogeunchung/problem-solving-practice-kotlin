package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1160__Find_Words_That_Can_Be_Formed_by_CharactersTest {

    @Test
    fun test1() {
        // Given
        val expected = 6

        // When
        val actual = countCharacters(words = arrayOf("cat", "bt", "hat", "tree"), chars = "atach")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 10

        // When
        val actual = countCharacters(words = arrayOf("hello", "world", "leetcode"), chars = "welldonehoneyr")

        // Then
        assertEquals(expected, actual)
    }
}
