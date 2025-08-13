package leetcode

import kotlin.math.max

fun maxPower(s: String): Int {
    var prev = '-'
    var localPower = 0
    var power = 0

    for (i in 0 until s.length) {
        if (s[i] == prev) {
            localPower++
        } else {
            prev = s[i]
            localPower = 1
        }

        power = max(power, localPower)
    }

    return power
}
