package leetcode

import org.junit.jupiter.api.*

internal class _78__SubsetsTest {

    @Test
    fun test1() {
        // Given
        val expected = listOf(
            emptyList(),
            listOf(1),
            listOf(2),
            listOf(1, 2),
            listOf(3),
            listOf(1, 3),
            listOf(2, 3),
            listOf(1, 2, 3),
        )

        // When
        val actual = subsets(nums = intArrayOf(1, 2, 3))

        // Then
        expected.forEach { expectedElem ->
            actual.any { actualElem -> actualElem.sorted() == expectedElem.sorted() }
        }
        actual.forEach { actualElem ->
            expected.any { expectedElem -> expectedElem.sorted() == actualElem.sorted() }
        }
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf(
            emptyList(),
            listOf(0),
        )

        // When
        val actual = subsets(nums = intArrayOf(0))

        // Then
        expected.forEach { expectedElem ->
            actual.any { actualElem -> actualElem.sorted() == expectedElem.sorted() }
        }
        actual.forEach { actualElem ->
            expected.any { expectedElem -> expectedElem.sorted() == actualElem.sorted() }
        }
    }
}
