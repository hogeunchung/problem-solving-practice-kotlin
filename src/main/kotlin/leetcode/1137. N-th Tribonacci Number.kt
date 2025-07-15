package leetcode

fun tribonacci(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1
    if (n == 2) return 1

    val tribonacci = IntArray(n + 1)
    tribonacci[0] = 0
    tribonacci[1] = 1
    tribonacci[2] = 1

    for (i in 3..n) {
        tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3]
    }

    return tribonacci[n]
}
