package leetcode

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val counts = MutableList(26) { 0 }

    for (i in s.indices) {
        counts[s[i] - 'a'] += 1
        counts[t[i] - 'a'] -= 1
    }

    return counts.none { it != 0 }
}
