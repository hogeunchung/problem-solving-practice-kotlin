package leetcode

class Solution914 {

    fun hasGroupsSizeX(deck: IntArray): Boolean {
        val counts = mutableMapOf<Int, Int>()
        for (i in 0 until deck.size) {
            counts[deck[i]] = counts.getOrDefault(deck[i], 0) + 1
        }

        val uniqueCounts = counts.values.toSet().toList()

        var gcd = uniqueCounts[0]
        if (gcd == 1) return false

        for (i in 1 until uniqueCounts.size) {
            gcd = calcGcd(gcd, uniqueCounts[i])
            if (gcd == 1) return false
        }

        return true
    }

    private fun calcGcd(a: Int, b: Int): Int {
        if (b == 0) return a
        return calcGcd(b, a % b)
    }
}
