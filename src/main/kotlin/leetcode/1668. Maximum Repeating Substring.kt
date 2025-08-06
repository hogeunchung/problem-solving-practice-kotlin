package leetcode

fun maxRepeating(sequence: String, word: String): Int {
    val memo = Array(sequence.length) { IntArray(word.length) }

    if (sequence[0] == word[0]) {
        memo[0][0] = 1
    }
    for (si in 1 until sequence.length) {
        if (sequence[si] == word[0]) {
            memo[si][0] = memo[si - 1][word.length - 1] + 1
        }
        for (wi in 1 until word.length) {
            if (sequence[si] == word[wi]) {
                memo[si][wi] = memo[si - 1][wi - 1]
            }
        }
    }

    return memo.maxOf { it[word.length - 1] }
}
