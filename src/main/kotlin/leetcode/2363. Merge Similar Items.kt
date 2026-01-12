package leetcode

class Solution2363 {

    fun mergeSimilarItems(items1: Array<IntArray>, items2: Array<IntArray>): List<List<Int>> {
        val result = mutableMapOf<Int, Int>()

        items1.forEach { item ->
            result[item[0]] = result.getOrDefault(item[0], 0) + item[1]
        }
        items2.forEach { item ->
            result[item[0]] = result.getOrDefault(item[0], 0) + item[1]
        }

        return result.map { listOf(it.key, it.value) }.sortedBy { it.first() }
    }
}
