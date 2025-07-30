package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _661__Image_SmootherTest {

    @Test
    fun test1() {
        // Given
        val expected = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
        )

        // When
        val actual = imageSmoother(
            img = arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 0, 1),
                intArrayOf(1, 1, 1),
            )
        )

        actual.forEach {
            it.forEach { print("$it ") }
            println()
        }


        // Then
        assertArrayEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = arrayOf(
            intArrayOf(137, 141, 137),
            intArrayOf(141, 138, 141),
            intArrayOf(137, 141, 137),
        )

        // When
        val actual = imageSmoother(
            img = arrayOf(
                intArrayOf(100, 200, 100),
                intArrayOf(200, 50, 200),
                intArrayOf(100, 200, 100),
            )
        )


        actual.forEach {
            it.forEach { print("$it ") }
            println()
        }

        // Then
        assertArrayEquals(expected, actual)
    }
}
