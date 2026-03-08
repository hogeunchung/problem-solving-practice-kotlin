package leetcode

class Solution3794 {

    fun reversePrefix(s: String, k: Int): String {
        val prefix = s.take(k).toCharArray()
        for (i in 0 until k / 2) {
            val tmp = prefix[i]
            prefix[i] = prefix[k - 1 - i]
            prefix[k - 1 - i] = tmp
        }

        return prefix.joinToString("") + s.substring(k)
    }
}
