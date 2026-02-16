package leetcode

import java.util.Stack

class Solution2696 {

    fun minLength(s: String): Int {
        val stack = Stack<Char>()

        s.forEach { c ->
            when {
                c == 'B' && stack.isNotEmpty() && stack.peek() == 'A' -> stack.pop()
                c == 'D' && stack.isNotEmpty() && stack.peek() == 'C' -> stack.pop()
                else -> stack.push(c)
            }
        }

        return stack.size
    }
}
