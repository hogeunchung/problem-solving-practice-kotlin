package leetcode

fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val maxCandyCount = candies.max()!!
    return candies.map { it + extraCandies >= maxCandyCount }
}
