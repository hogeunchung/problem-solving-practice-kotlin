package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _599__Minimum_Index_Sum_of_Two_ListsTest {

    @Test
    fun test1() {
        // Given
        val expected = arrayOf("Shogun")

        // When
        val actual = findRestaurant(
            list1 = arrayOf("Shogun", "Tapioca Express", "Burger King", "KFC"),
            list2 = arrayOf("Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"),
        )

        // Then
        assertArrayEquals(expected.sorted().toTypedArray(), actual.sorted().toTypedArray())
    }

    @Test
    fun test2() {
        // Given
        val expected = arrayOf("Shogun")

        // When
        val actual = findRestaurant(
            list1 = arrayOf("Shogun", "Tapioca Express", "Burger King", "KFC"),
            list2 = arrayOf("KFC", "Shogun", "Burger King"),
        )

        // Then
        assertArrayEquals(expected.sorted().toTypedArray(), actual.sorted().toTypedArray())
    }

    @Test
    fun test3() {
        // Given
        val expected = arrayOf("sad", "happy")

        // When
        val actual = findRestaurant(
            list1 = arrayOf("happy", "sad", "good"),
            list2 = arrayOf("sad", "happy", "good"),
        )

        // Then
        assertArrayEquals(expected.sorted().toTypedArray(), actual.sorted().toTypedArray())
    }

    @Test
    fun test4() {
        // Given
        val expected = arrayOf("Shogun", "Tapioca Express", "Burger King", "KFC")

        // When
        val actual = findRestaurant(
            list1 = arrayOf("Shogun", "Tapioca Express", "Burger King", "KFC"),
            list2 = arrayOf("KNN", "KFC", "Burger King", "Tapioca Express", "Shogun"),
        )

        // Then
        assertArrayEquals(expected.sorted().toTypedArray(), actual.sorted().toTypedArray())
    }
}
