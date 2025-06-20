package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _455__Assign_CookiesKtTest {

    @Test
    fun test1() {
        // Given
        val expected = 1

        // When
        val actual = findContentChildren(g = intArrayOf(1, 2, 3), s = intArrayOf(1, 1))

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = findContentChildren(g = intArrayOf(1, 2), s = intArrayOf(1, 2, 3))

        // Then
        assertEquals(expected, actual)
    }
}
