package leetcode

import kotlin.math.sqrt

class Solution914 {

    fun hasGroupsSizeX(deck: IntArray): Boolean {
        val counts = mutableMapOf<Int, Int>()
        for (i in 0 until deck.size) {
            counts[deck[i]] = counts.getOrDefault(deck[i], 0) + 1
        }

        val uniqueCounts = counts.values.toSet()
        val primes = calcPrimes(upperBound = uniqueCounts.max())
        for (i in primes) {
            if (uniqueCounts.all { it % i == 0 }) {
                return true
            }
        }

        return false
    }

    private fun calcPrimes(upperBound: Int): List<Int> {
        val primes = mutableListOf(2)

        for (num in 3..upperBound) {
            var isPrime = true
            val sqrt = sqrt(num.toDouble()).toInt()
            for (pi in 0 until primes.size) {
                if (num % primes[pi] == 0) {
                    isPrime = false
                    break
                }
                if (sqrt <= primes[pi]) {
                    break
                }
            }

            if (isPrime) {
                primes.add(num)
            }
        }

        return primes
    }
}
