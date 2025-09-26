package leetcode

fun mostVisited(n: Int, rounds: IntArray): List<Int> {
    val zeroIndexedRounds = rounds.map { it - 1 }

    var move = 0
    for (i in 0 until zeroIndexedRounds.size - 1) {
        move += (n + zeroIndexedRounds[i + 1] - zeroIndexedRounds[i]) % n
    }

    return if (move % n == n - 1) (1..n).toList()
    else (zeroIndexedRounds[0]..zeroIndexedRounds[0] + move % n).map { it % n + 1 }.sorted().toList()
}
