package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution1629Test {

    @Test
    fun test1() {
        // Given
        val expected = 'c'

        // When
        val actual = Solution1629().slowestKey(releaseTimes = intArrayOf(9, 29, 49, 50), keysPressed = "cbcd")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 'a'

        // When
        val actual = Solution1629().slowestKey(releaseTimes = intArrayOf(12, 23, 36, 46, 62), keysPressed = "spuda")

        // Then
        assertEquals(expected, actual)
    }
}
