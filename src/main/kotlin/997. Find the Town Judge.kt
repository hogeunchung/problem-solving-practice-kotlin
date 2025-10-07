class Solution997 {

    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        val trustRelationship = Array(n) { BooleanArray(n) }

        for (i in 0 until trust.size) {
            trustRelationship[trust[i][0] - 1][trust[i][1] - 1] = true
        }

        for (to in 0 until n) {
            var trustedByOthers = true
            for (from in 0 until n) {
                if (from != to && trustRelationship[from][to].not()) {
                    trustedByOthers = false
                    break
                }
            }

            if (trustedByOthers) {
                val believesNoOne = trustRelationship[to].all { it.not() }
                if (believesNoOne) {
                    return to + 1
                }
            }
        }

        return -1
    }
}
