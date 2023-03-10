package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _326__Power_of_ThreeKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = true

        // Act
        val actual = isPowerOfThree(n = 27)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = false

        // Act
        val actual = isPowerOfThree(n = 0)

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = false

        // Act
        val actual = isPowerOfThree(n = -1)

        // Assert
        assertEquals(expected, actual)
    }
}
