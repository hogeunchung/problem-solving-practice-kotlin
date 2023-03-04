package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class _287__Find_the_Duplicate_NumberKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 2
        // Act
        val actual = findDuplicate(intArrayOf(1, 3, 4, 2, 2))

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 3
        // Act
        val actual = findDuplicate(intArrayOf(3, 1, 3, 4, 2))

        // Assert
        assertEquals(expected, actual)
    }
}
