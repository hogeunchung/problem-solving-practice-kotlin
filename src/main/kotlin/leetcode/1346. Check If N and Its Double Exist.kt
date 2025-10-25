package leetcode

class Solution1346 {

    fun checkIfExist(arr: IntArray): Boolean {
        val n = arr.size
        val doubleMap = mutableMapOf<Int, MutableList<Int>>()
        for (i in 0 until n) {
            doubleMap[arr[i] * 2] = mutableListOf(i)
            if (doubleMap[arr[i] * 2] != null) {
                doubleMap[arr[i] * 2]!!.add(i)
            } else {
                doubleMap[arr[i] * 2] = mutableListOf(i)
            }
        }

        for (i in 0 until n) {
            if (doubleMap[arr[i]] != null && doubleMap[arr[i]]!!.any { it != i }) {
                return true
            }
        }

        return false
    }
}
