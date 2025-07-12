package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _942__DI_String_MatchTest {

    @Test
    fun test1() {
        // given & when
        val actual = diStringMatch(s = "IDID")

        // then
        assertEquals(5, actual.size)
        assertTrue(actual[0] < actual[1])
        assertTrue(actual[1] > actual[2])
        assertTrue(actual[2] < actual[3])
        assertTrue(actual[3] > actual[4])
    }

    @Test
    fun test2() {
        // given & when
        val actual = diStringMatch(s = "III")

        // then
        assertEquals(4, actual.size)
        assertTrue(actual[0] < actual[1])
        assertTrue(actual[1] < actual[2])
        assertTrue(actual[2] < actual[3])
    }

    @Test
    fun test3() {
        // given & when
        val actual = diStringMatch(s = "DDI")

        // then
        assertEquals(4, actual.size)
        assertTrue(actual[0] > actual[1])
        assertTrue(actual[1] > actual[2])
        assertTrue(actual[2] < actual[3])
    }
}
