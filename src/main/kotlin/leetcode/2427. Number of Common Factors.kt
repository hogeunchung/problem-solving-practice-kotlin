package leetcode

fun commonFactors(a: Int, b: Int): Int {
    var count = 0
    val min = if (a < b) a else b
    for (i in 1..min) {
        if (a % i == 0 && b % i == 0) {
            count++
        }
    }
    return count
}
