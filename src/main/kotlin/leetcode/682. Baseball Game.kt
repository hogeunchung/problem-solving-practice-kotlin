package leetcode

import java.util.Stack

class Solution682 {

    fun calPoints(operations: Array<String>): Int {
        val stack = Stack<Int>()
        operations.forEach { operation ->
            when (operation) {
                "+" -> {
                    val prev1 = stack.pop()
                    val prev2 = stack.pop()
                    stack.add(prev2)
                    stack.add(prev1)
                    stack.add(prev1 + prev2)
                }

                "D" -> stack.add(2 * stack.peek())
                "C" -> stack.pop()
                else -> stack.add(operation.toInt())
            }
        }

        return stack.sum()
    }
}
