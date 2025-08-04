package leetcode

fun countLargestGroup(n: Int): Int {
    val digitSumMap = (1..n)
        .map {
            var curr = it
            var sum = 0
            while (curr > 0) {
                sum += curr % 10
                curr /= 10
            }
            sum
        }
        .groupBy { it }

    val maxSize = digitSumMap.maxOfOrNull { it.value.size }!!
    return digitSumMap.filter { it.value.size == maxSize }.size
}
