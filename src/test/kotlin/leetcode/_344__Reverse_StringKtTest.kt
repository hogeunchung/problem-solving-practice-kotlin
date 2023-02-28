package leetcode

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class _344__Reverse_StringKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = "olleh".toCharArray()

        // Act
        val actual = "hello".toCharArray()
        reverseString(s = actual)

        // Assert
        assertContentEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = "hannaH".toCharArray()

        // Act
        val actual = "Hannah".toCharArray()
        reverseString(s = actual)

        // Assert
        assertContentEquals(expected, actual)
    }
}
