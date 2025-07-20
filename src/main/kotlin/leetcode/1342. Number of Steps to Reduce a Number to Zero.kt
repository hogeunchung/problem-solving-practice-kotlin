package leetcode

fun numberOfSteps(num: Int): Int {
    if (num == 0) return 0

    return if (num % 2 == 0) {
        numberOfSteps(num / 2) + 1
    } else {
        numberOfSteps(num - 1) + 1
    }
}
