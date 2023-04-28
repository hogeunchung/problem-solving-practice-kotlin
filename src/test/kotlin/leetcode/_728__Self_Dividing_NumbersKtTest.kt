package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _728__Self_Dividing_NumbersKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22)

        // Act
        val actual = selfDividingNumbers(left = 1, right = 22)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = listOf(48, 55, 66, 77)

        // Act
        val actual = selfDividingNumbers(left = 47, right = 85)

        // Assert
        assertEquals(expected, actual)
    }
}
