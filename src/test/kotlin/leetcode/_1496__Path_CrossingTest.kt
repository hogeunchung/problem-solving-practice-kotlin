package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1496__Path_CrossingTest {

    @Test
    fun test1() {
        // Given
        val expected = false

        // When
        val actual = isPathCrossing(path = "NES")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = true

        // When
        val actual = isPathCrossing(path = "NESWW")

        // Then
        assertEquals(expected, actual)
    }
}
