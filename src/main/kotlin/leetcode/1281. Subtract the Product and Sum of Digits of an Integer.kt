package leetcode

fun subtractProductAndSum(n: Int): Int {
    var curr = n
    var m = 1
    var s = 0
    while (curr > 0) {
        m *= curr % 10
        s += curr % 10
        curr /= 10
    }
    return m - s
}
