package leetcode

fun findKDistantIndices(nums: IntArray, key: Int, k: Int): List<Int> {
    val resultSet = mutableSetOf<Int>()
    nums.mapIndexed { i, num ->
        if (num == key) {
            for (dist in 0..k) {
                resultSet.add(i - dist)
                resultSet.add(i + dist)
            }
        }
    }
    return resultSet.filter { 0 <= it && it < nums.size }.toList().sorted()
}
