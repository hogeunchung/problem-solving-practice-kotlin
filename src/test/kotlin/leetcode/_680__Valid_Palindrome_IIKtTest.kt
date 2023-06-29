package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _680__Valid_Palindrome_IIKtTest {

    @Test
    fun test1() {
        // given
        val expected = true

        // when
        val actual = validPalindrome(s = "aba")

        // then
        assertEquals(/* expected = */ expected, /* actual = */ actual)
    }

    @Test
    fun test2() {
        // given
        val expected = true

        // when
        val actual = validPalindrome(s = "abca")

        // then
        assertEquals(/* expected = */ expected, /* actual = */ actual)
    }

    @Test
    fun test3() {
        // given
        val expected = false

        // when
        val actual = validPalindrome(s = "abc")

        // then
        assertEquals(/* expected = */ expected, /* actual = */ actual)
    }

    @Test
    fun test4() {
        // given
        val expected = true

        // when
        val actual = validPalindrome(s = "eccer")

        // then
        assertEquals(/* expected = */ expected, /* actual = */ actual)
    }

    @Test
    fun test5() {
        // given
        val expected = true

        // when
        val actual =
            validPalindrome(s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga")

        // then
        assertEquals(/* expected = */ expected, /* actual = */ actual)
    }
}
