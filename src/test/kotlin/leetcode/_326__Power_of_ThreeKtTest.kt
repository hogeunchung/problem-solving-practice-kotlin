package leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class _326__Power_of_ThreeKtTest {

    @Test
    fun test1() {
        // Given
        val expected = true

        // When
        val actual = isPowerOfThree(n = 27)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = false

        // When
        val actual = isPowerOfThree(n = 0)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = false

        // When
        val actual = isPowerOfThree(n = -1)

        // Then
        assertEquals(expected, actual)
    }
}
