package leetcode

class Solution3285 {

    fun stableMountains(height: IntArray, threshold: Int): List<Int> {
        return height
            .mapIndexed { idx, height -> idx to height }
            .filter { it.first < height.size - 1 && it.second > threshold }
            .map { it.first + 1 }
            .toList()
    }
}
