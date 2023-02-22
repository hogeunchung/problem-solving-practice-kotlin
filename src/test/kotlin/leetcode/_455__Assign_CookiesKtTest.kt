package leetcode

import org.junit.jupiter.api.Test

class _455__Assign_CookiesKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 1

        // Act
        val actual = findContentChildren(g = intArrayOf(1, 2, 3), s = intArrayOf(1, 1))

        // Assert
        kotlin.test.assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 2

        // Act
        val actual = findContentChildren(g = intArrayOf(1, 2), s = intArrayOf(1, 2, 3))

        // Assert
        kotlin.test.assertEquals(expected, actual)
    }
}
