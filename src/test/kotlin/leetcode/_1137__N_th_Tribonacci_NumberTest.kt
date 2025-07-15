package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _1137__N_th_Tribonacci_NumberTest {

    @Test
    fun test1() {
        // Given
        val expected = 4

        // When
        val actual = tribonacci(n = 4)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 1389537

        // When
        val actual = tribonacci(n = 25)

        // Then
        assertEquals(expected, actual)
    }
}
