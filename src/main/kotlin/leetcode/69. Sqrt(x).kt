package leetcode

fun mySqrt(x: Int): Int {
    for (i in 0L..x.toLong() + 1L) {
        if (i * i > x.toLong()) {
            return (i - 1L).toInt()
        }
    }

    return -1
}
