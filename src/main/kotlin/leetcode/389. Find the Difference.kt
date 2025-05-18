package leetcode

fun findTheDifference(s: String, t: String): Char {
    val alphabetCounts = IntArray(26)

    s.forEach { alphabet ->
        alphabetCounts[alphabet - 'a']++
    }

    t.forEach { alphabet ->
        if (alphabetCounts[alphabet - 'a'] == 0) {
            return alphabet
        }
        alphabetCounts[alphabet - 'a']--
    }

    error("Not available")
}
