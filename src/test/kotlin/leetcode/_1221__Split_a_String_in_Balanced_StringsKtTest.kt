package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _1221__Split_a_String_in_Balanced_StringsKtTest {
    @Test
    fun test1() {
        // Arrange
        val expected = 4

        // Act
        val actual = balancedStringSplit(s = "RLRRLLRLRL")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 2

        // Act
        val actual = balancedStringSplit(s = "RLRRRLLRLL")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = 1

        // Act
        val actual = balancedStringSplit(s = "LLLLRRRR")

        // Assert
        assertEquals(expected, actual)
    }
}
