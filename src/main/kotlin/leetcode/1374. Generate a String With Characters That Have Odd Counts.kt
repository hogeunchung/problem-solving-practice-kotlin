package leetcode

fun generateTheString(n: Int): String {
    return if (n % 2 == 0) "a".repeat(n-1) + "b"
    else "a".repeat(n)
}
