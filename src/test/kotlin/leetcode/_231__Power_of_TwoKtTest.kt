package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _231__Power_of_TwoKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = true

        // Act
        val actual = isPowerOfTwo(n = 1)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = true

        // Act
        val actual = isPowerOfTwo(n = 16)

        // Assert
        assertEquals(expected, actual)
    }
    
    @Test
    fun test3() {
        // Arrange
        val expected = false

        // Act
        val actual = isPowerOfTwo(n = 3)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Arrange
        val expected = false

        // Act
        val actual = isPowerOfTwo(n = 0)

        // Assert
        assertEquals(expected, actual)
    }
}
