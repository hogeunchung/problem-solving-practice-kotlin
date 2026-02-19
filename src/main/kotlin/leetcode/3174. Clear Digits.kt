package leetcode

import java.util.Stack

class Solution3174 {

    fun clearDigits(s: String): String {
        val stack = Stack<Char>()

        s.forEach { c ->
            if (c.isDigit()) stack.pop()
            else stack.push(c)
        }

        return stack.elements().toList().joinToString("")
    }
}
