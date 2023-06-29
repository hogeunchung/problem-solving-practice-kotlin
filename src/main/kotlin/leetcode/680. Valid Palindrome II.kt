package leetcode

fun validPalindrome(s: String): Boolean {
    return internalValidPalindrome(
        s,
        tolerance = 1,
        leftPadding = 0,
        rightPadding = 0
    )
}

private fun internalValidPalindrome(
    s: String,
    tolerance: Int,
    leftPadding: Int,
    rightPadding: Int
): Boolean {
    (0 until ((s.length - leftPadding - rightPadding) / 2)).map { si ->
        if (s[si + leftPadding] != s[s.length - 1 - si - rightPadding]) {
            if (tolerance == 0) return false

            return internalValidPalindrome(
                s = s,
                tolerance = tolerance - 1,
                leftPadding = leftPadding + si + 1,
                rightPadding = rightPadding + si
            ) || internalValidPalindrome(
                s = s,
                tolerance = tolerance - 1,
                leftPadding = leftPadding + si,
                rightPadding = rightPadding + si + 1
            )
        }
    }

    return true
}
