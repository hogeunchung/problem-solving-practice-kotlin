package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _171__Excel_Sheet_Column_NumberKtTest {
    @Test
    fun test1() {
        // Arrange
        val expected = 1

        // Act
        val actual = titleToNumber(columnTitle = "A")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 28

        // Act
        val actual = titleToNumber(columnTitle = "AB")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 701

        // Act
        val actual = titleToNumber(columnTitle = "ZY")

        // Assert
        assertEquals(expected, actual)
    }
}
