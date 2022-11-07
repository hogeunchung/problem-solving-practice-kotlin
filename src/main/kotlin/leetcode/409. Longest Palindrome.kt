package leetcode

fun longestPalindrome(s: String): Int {
    val charCountMap = mutableMapOf<Char, Int>()
    for (char in s) {
        charCountMap[char] = (charCountMap[char] ?: 0) + 1
    }

    var longestLength = 0
    var hasCenterChar = false
    for (count in charCountMap.values) {
        longestLength += count
        if (count % 2 != 0) {
            longestLength -= 1
            hasCenterChar = true
        }
    }

    return longestLength + if (hasCenterChar) 1 else 0
}
