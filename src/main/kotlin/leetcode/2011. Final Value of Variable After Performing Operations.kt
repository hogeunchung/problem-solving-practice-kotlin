package leetcode

fun finalValueAfterOperations(operations: Array<String>): Int {
    var result = 0
    operations.forEach {
        when (it) {
            "++X", "X++" -> result++
            "--X", "X--" -> result--
            else -> Unit
        }
    }
    return result
}
