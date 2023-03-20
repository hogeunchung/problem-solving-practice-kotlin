package leetcode

fun numJewelsInStones(jewels: String, stones: String): Int {
    var count = 0
    stones.forEach { if (it in jewels) count++ }
    return count
}
