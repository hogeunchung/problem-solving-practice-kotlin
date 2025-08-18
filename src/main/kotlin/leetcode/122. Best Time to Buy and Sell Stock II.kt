package leetcode

fun maxProfit(prices: IntArray): Int {
    val n = prices.size

    var result = 0
    for (i in 1 until n) {
        val diff = prices[i] - prices[i - 1]
        if (diff > 0) result += diff
    }

    return result
}
