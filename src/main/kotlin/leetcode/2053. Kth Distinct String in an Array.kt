package leetcode

class Solution2053 {

    fun kthDistinct(arr: Array<String>, k: Int): String {
        return arr
            .groupBy { it }
            .filter { it.value.size == 1 }
            .map { it.value.first() }
            .getOrNull(k - 1)
            ?: ""
    }
}
