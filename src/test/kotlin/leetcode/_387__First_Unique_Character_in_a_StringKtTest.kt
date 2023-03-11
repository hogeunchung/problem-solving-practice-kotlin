package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _387__First_Unique_Character_in_a_StringKtTest {

    @Test
    fun test1() {
        // Arrange
        val expected = 0

        // Act
        val actual = firstUniqChar(s = "leetcode")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = 2

        // Act
        val actual = firstUniqChar(s = "loveleetcode")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = -1

        // Act
        val actual = firstUniqChar(s = "aabb")

        // Assert
        assertEquals(expected, actual)
    }
}
