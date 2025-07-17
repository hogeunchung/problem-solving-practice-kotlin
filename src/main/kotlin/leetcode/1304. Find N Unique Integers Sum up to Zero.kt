package leetcode

fun sumZero(n: Int): IntArray {
    val result = IntArray(n)

    if (n % 2 == 0) {
        for (i in 0 until n / 2) {
            result[2 * i] = (i + 1)
            result[2 * i + 1] = -(i + 1)
        }
    } else {
        for (i in 0 until n / 2) {
            result[2 * i + 1] = (i + 1)
            result[2 * i + 2] = -(i + 1)
        }
    }

    return result
}
