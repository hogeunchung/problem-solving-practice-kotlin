package leetcode

class Solution3248 {

    fun finalPositionOfSnake(n: Int, commands: List<String>): Int {
        var result = 0

        commands.forEach { command ->
            when (command) {
                "RIGHT" -> result++
                "LEFT" -> result--
                "UP" -> result -= n
                "DOWN" -> result += n
            }
        }

        return result
    }
}
