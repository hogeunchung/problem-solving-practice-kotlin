package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _821__Shortest_Distance_to_a_CharacterTest {

    @Test
    fun test1() {
        // given
        val expected = intArrayOf(3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0)

        // when
        val actual = shortestToChar(s = "loveleetcode", c = 'e')

        // then
        assertArrayEquals(/* expected = */ expected, /* actual = */ actual)
    }

    @Test
    fun test2() {
        // given
        val expected = intArrayOf(3, 2, 1, 0)

        // when
        val actual = shortestToChar(s = "aaab", c = 'b')

        // then
        assertArrayEquals(/* expected = */ expected, /* actual = */ actual)
    }
}
