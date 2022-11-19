package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _67__Add_BinaryKtTest {
    @Test
    fun test1() {
        // Arrange
        val expected = "100"

        // Act
        val actual = addBinary(a = "11", b = "1")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = "10101"

        // Act
        val actual = addBinary(a = "1010", b = "1011")

        // Assert
        assertEquals(expected, actual)
    }
}
