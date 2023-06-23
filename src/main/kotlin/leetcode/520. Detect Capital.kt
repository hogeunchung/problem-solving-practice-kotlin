package leetcode

fun detectCapitalUse(word: String): Boolean {
    return word.all { it.isUpperCase() }
            || word.all { it.isLowerCase() }
            || word[0].isUpperCase() && word.takeLast(word.length - 1).all { it.isLowerCase() }
}
