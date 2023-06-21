package leetcode

fun findRelativeRanks(score: IntArray): Array<String> {
    score
        .mapIndexed { index, score -> index to score }
        .sortedByDescending { it.second }
        .mapIndexed { rankIndex, scoreIndexToScore -> score[scoreIndexToScore.first] = rankIndex + 1 }

    return score
        .map {
            when (it) {
                1 -> "Gold Medal"
                2 -> "Silver Medal"
                3 -> "Bronze Medal"
                else -> it.toString()
            }
        }
        .toTypedArray()
}
