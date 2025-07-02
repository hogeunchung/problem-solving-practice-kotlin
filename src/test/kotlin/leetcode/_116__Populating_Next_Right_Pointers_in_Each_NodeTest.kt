package leetcode

import leetcode.dataStructure.Node
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _116__Populating_Next_Right_Pointers_in_Each_NodeTest {

    @Test
    fun test1() {
        // Given
        val nodes = (1..7).associateWith { Node(`val` = it) }

        nodes[1]?.left = nodes[2]
        nodes[1]?.right = nodes[3]
        nodes[2]?.left = nodes[4]
        nodes[2]?.right = nodes[5]
        nodes[3]?.left = nodes[6]
        nodes[3]?.right = nodes[7]

        val root = nodes[1]

        val expectedNodes = (1..7).associateWith { Node(`val` = it) }

        expectedNodes[1]?.left = expectedNodes[2]
        expectedNodes[1]?.right = expectedNodes[3]
        expectedNodes[2]?.left = expectedNodes[4]
        expectedNodes[2]?.right = expectedNodes[5]
        expectedNodes[3]?.left = expectedNodes[6]
        expectedNodes[3]?.right = expectedNodes[7]

        expectedNodes[1]?.next = null
        expectedNodes[2]?.next = expectedNodes[3]
        expectedNodes[3]?.next = null
        expectedNodes[4]?.next = expectedNodes[5]
        expectedNodes[5]?.next = expectedNodes[6]
        expectedNodes[6]?.next = expectedNodes[7]
        expectedNodes[7]?.next = null

        // When
        val actual = connect(root = root)

        // Then
        assertAll(
            { assertEquals(null, actual?.next) },
            { assertEquals(actual?.right, actual?.left?.next) },
            { assertEquals(null, actual?.right?.next) },
            { assertEquals(actual?.left?.right, actual?.left?.left?.next) },
            { assertEquals(actual?.right?.left, actual?.left?.right?.next) },
            { assertEquals(actual?.right?.right, actual?.right?.left?.next) },
            { assertEquals(null, actual?.right?.right?.next) },
        )
    }

    @Test
    fun test2() {
        // Given
        val root = null
        val expected = null

        // When
        val actual = connect(root = root)

        // Then
        assertEquals(expected, actual)
    }
}
