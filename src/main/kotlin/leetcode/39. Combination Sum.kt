package leetcode

fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    return helper(
        candidates = candidates,
        candidateIndex = 0,
        target = target,
        path = emptyList()
    )
}

private fun helper(candidates: IntArray, candidateIndex: Int, target: Int, path: List<Int>): List<List<Int>> {
    if (target == 0) return listOf(path.toList())
    if (candidateIndex == candidates.size) return emptyList()

    val num = candidates[candidateIndex]
    var currTarget = target
    val currPath = path.toMutableList()
    val result = mutableListOf<List<Int>>()

    while (currTarget >= 0) {
        val currResult = helper(
            candidates = candidates,
            candidateIndex = candidateIndex + 1,
            target = currTarget,
            path = currPath,
        )
        result.addAll(currResult)

        currTarget -= num
        currPath += num
    }

    return result
}
