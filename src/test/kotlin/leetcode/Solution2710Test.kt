package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class Solution2710Test {

    @Test
    fun test1() {
        // Given
        val expected = "512301"

        // When
        val actual = Solution2710().removeTrailingZeros(num = "51230100")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "123"

        // When
        val actual = Solution2710().removeTrailingZeros(num = "123")

        // Then
        assertEquals(expected, actual)
    }
}
