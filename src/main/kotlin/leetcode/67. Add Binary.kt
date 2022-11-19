package leetcode

import kotlin.math.min

fun addBinary(a: String, b: String): String {
    val ra = a.reversed()
    val rb = b.reversed()
    var rs = ""

    var cast = 0
    var i = 0
    while (i < min(ra.length, rb.length)) {
        val sum = (ra[i] - '0') + (rb[i] - '0') + cast
        rs += sum % 2
        cast = sum / 2
        i++
    }

    while (i < ra.length) {
        val sum = (ra[i] - '0') + cast
        rs += sum % 2
        cast = sum / 2
        i++
    }

    while (i < rb.length) {
        val sum = (rb[i] - '0') + cast
        rs += sum % 2
        cast = sum / 2
        i++
    }

    if (cast == 1) {
        rs += cast
    }

    return rs.reversed()
}
