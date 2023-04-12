package leetcode

fun countDigits(num: Int): Int {
    val counts = IntArray(10)
    var curr = num
    while (curr > 0) {
        counts[curr % 10] += 1
        curr /= 10
    }
    var result = 0
    (1..9).map { if (num % it == 0) result += counts[it] }
    return result
}
