package leetcode

fun countTriples(n: Int): Int {
    var count = 0
    for (i in 1..n) {
        for (j in 1..n) {
            for (k in 1..n) {
                if (i * i + j * j == k * k) {
                    count++
                }
            }
        }
    }

    return count
}
