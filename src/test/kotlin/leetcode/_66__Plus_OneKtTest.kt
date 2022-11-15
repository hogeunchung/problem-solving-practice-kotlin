package leetcode

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

internal class _66__Plus_OneKtTest {
    @Test
    fun test1() {
        // Arrange
        val expected = intArrayOf(1, 2, 4)

        // Act
        val actual = plusOne(digits = intArrayOf(1, 2, 3))

        // Assert
        assertContentEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = intArrayOf(4, 3, 2, 2)

        // Act
        val actual = plusOne(digits = intArrayOf(4, 3, 2, 1))

        // Assert
        assertContentEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = intArrayOf(1, 0)

        // Act
        val actual = plusOne(digits = intArrayOf(9))

        // Assert
        assertContentEquals(expected, actual)
    }
}
