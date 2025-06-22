package leetcode

fun isPalindrome(s: String): Boolean {
    val refinedChars = s
        .lowercase()
        .filter { it in 'a'..'z' || it in '0'..'9' }
        .toCharArray()

    for (i in 0 until (refinedChars.size / 2)) {
        if (refinedChars[i] != refinedChars[refinedChars.size - 1 - i]) {
            return false
        }
    }

    return true
}
