package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _225__Implement_Stack_using_QueuesKtTest {

    @Test
    fun test1() {
        // Given
        val obj = MyStack()

        // When & Then
        obj.push(1)
        obj.push(2)
        assertEquals(2, obj.top())
        assertEquals(2, obj.pop())
        assertEquals(false, obj.empty())
    }
}
