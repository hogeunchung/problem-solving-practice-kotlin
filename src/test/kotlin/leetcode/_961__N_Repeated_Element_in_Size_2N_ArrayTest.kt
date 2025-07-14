package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _961__N_Repeated_Element_in_Size_2N_ArrayTest {

    @Test
    fun test1() {
        // given
        val expected = 3

        // when
        val actual = repeatedNTimes(nums = intArrayOf(1, 2, 3, 3))

        // then
        assertEquals(/* expected = */ expected, /* actual = */ actual)
    }

    @Test
    fun test2() {
        // given
        val expected = 2

        // when
        val actual = repeatedNTimes(nums = intArrayOf(2, 1, 2, 5, 3, 2))

        // then
        assertEquals(/* expected = */ expected, /* actual = */ actual)
    }

    @Test
    fun test3() {
        // given
        val expected = 5

        // when
        val actual = repeatedNTimes(nums = intArrayOf(5, 1, 5, 2, 5, 3, 5, 4))

        // then
        assertEquals(/* expected = */ expected, /* actual = */ actual)
    }
}
