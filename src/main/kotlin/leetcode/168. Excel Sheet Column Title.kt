package leetcode

fun convertToTitle(columnNumber: Int): String {
    val result = StringBuilder()
    var curr = columnNumber - 1
    while (curr >= 0) {
        result.append(((curr) % 26 + 'A'.code).toChar())
        curr = curr / 26 - 1
    }

    return result.toString().reversed()
}
