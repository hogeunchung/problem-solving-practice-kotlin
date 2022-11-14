package leetcode

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class _242__Valid_AnagramKtTest {
    @Test
    fun test1() {
        // Arrange
        val expected = true

        // Act
        val actual = isAnagram(
            s = "anagram",
            t = "nagaram"
        )

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = false

        // Act
        val actual = isAnagram(
            s = "rat",
            t = "car"
        )

        // Assert
        assertEquals(expected, actual)
    }
}
