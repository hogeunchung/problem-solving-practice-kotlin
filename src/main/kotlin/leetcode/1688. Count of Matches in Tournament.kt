package leetcode

fun numberOfMatches(n: Int): Int {
    var curr = n
    var result = 0
    while (curr > 1) {
        result += curr / 2
        curr = if (curr % 2 == 0) curr / 2 else (curr - 1) / 2 + 1
    }
    return result
}
