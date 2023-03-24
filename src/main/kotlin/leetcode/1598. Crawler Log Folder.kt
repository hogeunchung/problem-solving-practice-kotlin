package leetcode

fun minOperations(logs: Array<String>): Int {
    return logs.fold(0) { acc, s ->
        when (s) {
            "../" -> if (0 > acc - 1) 0 else acc - 1
            "./" -> acc
            else -> acc + 1
        }
    }
}
