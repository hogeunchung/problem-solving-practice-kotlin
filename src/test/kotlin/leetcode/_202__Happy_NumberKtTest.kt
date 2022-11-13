package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _202__Happy_NumberKtTest {
    @Test
    fun `test1`() {
        // Arrange
        val expected = true

        // Act
        val actual = isHappy(19)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun `test2`() {
        // Arrange
        val expected = false

        // Act
        val actual = isHappy(2)

        // Assert
        assertEquals(expected, actual)
    }
}
