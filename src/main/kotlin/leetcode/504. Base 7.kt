package leetcode

fun convertToBase7(num: Int): String {
    return convert(num = num, base = 7)
}

private fun convert(num: Int, base: Int): String {
    if (num == 0) return "0"

    val sb = StringBuilder()
    val isNegative = num < 0

    var curr = if (isNegative) -num else num
    while (curr > 0) {
        sb.append(curr % base)
        curr /= base
    }

    return if (isNegative) {
        "-${sb.reversed()}"
    } else {
        sb.reversed().toString()
    }
}
