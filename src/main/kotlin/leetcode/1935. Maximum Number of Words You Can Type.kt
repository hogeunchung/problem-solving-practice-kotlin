package leetcode

class Solution1935 {

    fun canBeTypedWords(text: String, brokenLetters: String): Int {
        val brokenLetterSet = brokenLetters.toHashSet()

        return text
            .split(" ")
            .count { it.toSet().any { brokenLetterSet.contains(it) }.not() }
    }
}
