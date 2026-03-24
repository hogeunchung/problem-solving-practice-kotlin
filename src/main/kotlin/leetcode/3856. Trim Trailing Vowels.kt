package leetcode

class Solution3856 {

    fun trimTrailingVowels(s: String): String {
        for (i in s.length - 1 downTo 0) {
            if (s[i] !in setOf('a', 'e', 'i', 'o', 'u')) {
                return s.take(i + 1)
            }
        }

        return ""
    }
}
