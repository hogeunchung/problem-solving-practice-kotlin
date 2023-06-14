package leetcode

import kotlin.math.max

fun addStrings(num1: String, num2: String): String {
    val length1 = num1.length
    val length2 = num2.length

    val result = StringBuilder()
    var cast = 0
    (0 until max(length1, length2)).map {
        var sum = cast
        if (it < length1) sum += num1[length1 - 1 - it].toInt() - '0'.toInt()
        if (it < length2) sum += num2[length2 - 1 - it].toInt() - '0'.toInt()

        if (sum >= 10) {
            result.insert(0, (sum - 10).toString())
            cast = 1
        } else {
            result.insert(0, sum.toString())
            cast = 0
        }
    }

    if (cast == 1) result.insert(0, cast.toString())

    return result.toString()
}
