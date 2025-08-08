package leetcode

fun countBalls(lowLimit: Int, highLimit: Int): Int {
    val sums = mutableMapOf<Int, Int>()
    for (num in lowLimit..highLimit) {
        var curr = num
        var sum = 0
        while (curr > 0) {
            sum += curr % 10
            curr /= 10
        }
        sums[sum] = sums.getOrDefault(sum, 0) + 1
    }

    return sums.maxOf { it.value }
}
