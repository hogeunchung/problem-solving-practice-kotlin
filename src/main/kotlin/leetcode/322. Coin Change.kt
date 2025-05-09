package leetcode

fun coinChange(coins: IntArray, amount: Int): Int {
    val memo = IntArray(amount + 1)
    val visit = BooleanArray(amount + 1)

    memo[0] = 0
    visit[0] = true

    for (i in 0..amount) {
        if (i != 0 && visit[i].not()) {
            continue
        }

        coins.forEach { coin ->
            if (0 <= i + coin && i + coin <= amount) {
                if (visit[i + coin].not() || memo[i + coin] > memo[i] + 1) {
                    memo[i + coin] = memo[i] + 1
                    visit[i + coin] = true
                }
            }
        }
    }

    return if (visit[amount]) {
        memo[amount]
    } else {
        -1
    }
}
