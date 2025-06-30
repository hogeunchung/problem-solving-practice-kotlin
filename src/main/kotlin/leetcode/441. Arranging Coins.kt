package leetcode

fun arrangeCoins(n: Int): Int {
    var curr = n
    var i = 0
    while (true) {
        if (curr == 0) return i
        if (curr < 0) return i - 1

        i++
        curr -= i
    }
}
