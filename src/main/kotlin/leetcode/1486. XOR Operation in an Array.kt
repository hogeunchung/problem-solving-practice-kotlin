package leetcode

fun xorOperation(n: Int, start: Int): Int {
    return (0 until n).fold(0) { total, num -> total.xor(start + 2 * num) }
}
