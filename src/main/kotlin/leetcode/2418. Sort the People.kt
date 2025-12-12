package leetcode

class Solution2418 {

    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        return heights
            .mapIndexed { index, height -> index to height }
            .sortedByDescending { it.second }
            .map { names[it.first] }
            .toTypedArray()
    }
}
