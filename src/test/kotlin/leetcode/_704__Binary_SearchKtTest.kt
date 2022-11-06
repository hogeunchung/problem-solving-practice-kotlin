package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _704__Binary_SearchKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 4

        // Act
        val actual = leetcode.search(intArrayOf(-1, 0, 3, 5, 9, 12), 9)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = -1

        // Act
        val actual = leetcode.search(intArrayOf(-1, 0, 3, 5, 9, 12), 2)

        // Assert
        assertEquals(expected, actual)
    }
}
