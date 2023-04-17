package leetcode

fun largestAltitude(gain: IntArray): Int {
    var sum = 0
    var max = 0
    gain.map {
        sum += it
        if (sum > max) max = sum
    }
    return max
}
