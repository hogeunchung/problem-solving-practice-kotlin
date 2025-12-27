package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution748Test {

    @Test
    fun test1() {
        // Given
        val expected = "steps"

        // When
        val actual = Solution748().shortestCompletingWord(
            licensePlate = "1s3 PSt",
            words = arrayOf("step", "steps", "stripe", "stepple"),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "pest"

        // When
        val actual = Solution748().shortestCompletingWord(
            licensePlate = "1s3 456",
            words = arrayOf("looks", "pest", "stew", "show"),
        )

        // Then
        assertEquals(expected, actual)
    }
}
