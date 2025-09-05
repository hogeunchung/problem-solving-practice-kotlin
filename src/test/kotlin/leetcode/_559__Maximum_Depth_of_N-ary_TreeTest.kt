package leetcode

import leetcode.dataStructure.Node
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class `_559__Maximum_Depth_of_N-ary_TreeTest` {

    @Test
    fun test1() {
        // Given
        val expected = 3

        // When
        val root = Node(`val` = 1)
            .apply {
                children = listOf(
                    Node(`val` = 3)
                        .apply {
                            children = listOf(
                                Node(`val` = 5),
                                Node(`val` = 6),
                            )
                        },
                    Node(`val` = 2),
                    Node(`val` = 4),
                )
            }
        val actual = maxDepth(root = root)

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = 5

        // When
        val root = Node(`val` = 1)
            .apply {
                children = listOf(
                    Node(`val` = 2),
                    Node(`val` = 3)
                        .apply {
                            children = listOf(
                                Node(`val` = 6),
                                Node(`val` = 7)
                                    .apply {
                                        children = listOf(
                                            Node(`val` = 11)
                                                .apply {
                                                    children = listOf(Node(`val` = 14))
                                                },
                                        )
                                    },
                            )
                        },
                    Node(`val` = 4)
                        .apply {
                            children = listOf(
                                Node(`val` = 8)
                                    .apply {
                                        children = listOf(Node(`val` = 12))
                                    },
                            )
                        },
                    Node(`val` = 5)
                        .apply {
                            children = listOf(
                                Node(`val` = 9)
                                    .apply {
                                        children = listOf(Node(`val` = 13))
                                    },
                                Node(`val` = 10),
                            )
                        },
                )
            }
        val actual = maxDepth(root = root)

        // Then
        assertEquals(expected, actual)
    }
}
