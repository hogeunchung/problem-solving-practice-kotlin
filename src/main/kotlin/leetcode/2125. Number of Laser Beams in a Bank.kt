package leetcode

class Solution2125 {

    fun numberOfBeams(bank: Array<String>): Int {
        val deviceCounts = bank
            .map { floor -> floor.count { it == '1' } }
            .filter { it > 0 }

        var result = 0
        for (i in 0 until deviceCounts.size - 1) {
            result += deviceCounts[i] * deviceCounts[i + 1]
        }

        return result
    }
}
