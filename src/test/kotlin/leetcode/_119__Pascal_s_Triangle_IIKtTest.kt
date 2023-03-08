package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _119__Pascal_s_Triangle_IIKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = listOf(1, 3, 3, 1)

        // Act
        val actual = getRow(rowIndex = 3)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = listOf(1)

        // Act
        val actual = getRow(rowIndex = 0)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = listOf(1, 1)

        // Act
        val actual = getRow(rowIndex = 1)

        // Assert
        assertEquals(expected, actual)
    }
}
