package leetcode

fun balancedStringSplit(s: String): Int {
    var balance = 0
    var count = 0
    for (i in s.indices) {
        balance += if (s[i] == 'R') 1 else -1
        if (balance == 0) count++
    }
    return count
}
