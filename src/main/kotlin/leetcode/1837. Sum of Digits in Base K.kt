package leetcode

fun sumBase(n: Int, k: Int): Int {
    var dividend = n
    var result = 0
    while (dividend > 0) {
        result += dividend % k
        dividend /= k
    }

    return result
}
