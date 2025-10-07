import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class Solution997Test {

    @Test
    fun test1() {
        // Given
        val expected = 2

        // When
        val actual = Solution997().findJudge(
            n = 2,
            trust = arrayOf(intArrayOf(1, 2)),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 3

        // When
        val actual = Solution997().findJudge(
            n = 3,
            trust = arrayOf(intArrayOf(1, 3), intArrayOf(2, 3)),
        )

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = -1

        // When
        val actual = Solution997().findJudge(
            n = 3,
            trust = arrayOf(intArrayOf(1, 3), intArrayOf(2, 3), intArrayOf(3, 1)),
        )

        // Then
        assertEquals(expected, actual)
    }
}
