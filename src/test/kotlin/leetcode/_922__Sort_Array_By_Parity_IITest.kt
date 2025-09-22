package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _922__Sort_Array_By_Parity_IITest {

    @Test
    fun test1() {
        // given
        val expected = intArrayOf(4, 5, 2, 7)

        // when
        val actual = sortArrayByParityII(nums = intArrayOf(4, 2, 5, 7))

        // then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // given
        val expected = intArrayOf(2, 3)

        // when
        val actual = sortArrayByParityII(nums = intArrayOf(2, 3))

        // then
        assertArrayEquals(expected, actual)
    }
}
