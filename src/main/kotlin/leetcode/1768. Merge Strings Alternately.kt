package leetcode

import kotlin.math.max

fun mergeAlternately(word1: String, word2: String): String {
    val result = StringBuilder()
    for (p in 0 until max(word1.length, word2.length)) {
        when {
            p >= word1.length && p >= word2.length -> break
            p >= word1.length -> {
                result.append(word2.substring(p))
                break
            }

            p >= word2.length -> {
                result.append(word1.substring(p))
                break
            }

            else -> {
                result.append(word1[p])
                result.append(word2[p])
            }
        }
    }

    return result.toString()
}
