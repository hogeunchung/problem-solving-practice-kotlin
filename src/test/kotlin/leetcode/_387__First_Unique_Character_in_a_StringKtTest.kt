package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _387__First_Unique_Character_in_a_StringKtTest {

    @Test
    fun test1() {
        // Given
        val expected = 0

        // When
        val actual = firstUniqChar(s = "leetcode")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 2

        // When
        val actual = firstUniqChar(s = "loveleetcode")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = -1

        // When
        val actual = firstUniqChar(s = "aabb")

        // Then
        assertEquals(expected, actual)
    }
}
