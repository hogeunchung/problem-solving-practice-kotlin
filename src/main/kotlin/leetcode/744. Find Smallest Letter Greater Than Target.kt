package leetcode

fun nextGreatestLetter(letters: CharArray, target: Char): Char {
    val n = letters.size
    for (i in 0 until n) {
        if (letters[i] > target) {
            return letters[i]
        }
    }

    return letters[0]
}
