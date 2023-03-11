package leetcode

fun firstUniqChar(s: String): Int {
    val counts = IntArray(26)
    val base = 'a'.toInt()
    for (c in s) counts[c.toInt() - base]++

    for (i in s.indices)
        if (counts[s[i].toInt() - base] == 1)
            return i

    return -1
}
