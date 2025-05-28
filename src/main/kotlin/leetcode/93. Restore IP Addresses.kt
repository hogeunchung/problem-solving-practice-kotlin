package leetcode

import kotlin.math.min

fun restoreIpAddresses(s: String): List<String> {
    val n = s.length + 1

    val result = mutableListOf<String>()
    for (i in 1 until n - 3)
        for (j in i + 1 until min(i + 4, n - 2)) {
            for (k in j + 1 until min(j + 4, n - 1)) {
                val subIps = listOf(
                    s.substring(0, i),
                    s.substring(i, j),
                    s.substring(j, k),
                    s.substring(k),
                )

                println(subIps)
                if (subIps.all { subIp -> subIp == "0" || (subIp[0] != '0' && subIp.toInt() <= 255) }) {

                    println("[ADD] $subIps")
                    result.add(subIps.joinToString("."))
                }
            }
        }

    return result
}
