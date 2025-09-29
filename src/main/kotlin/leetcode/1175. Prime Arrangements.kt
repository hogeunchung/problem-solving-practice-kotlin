package leetcode

import kotlin.math.pow
import kotlin.math.sqrt

fun numPrimeArrangements(n: Int): Int {
    if (n == 1) return 1

    val mod = 10.0.pow(9.0).toInt() + 7

    val primeMap = BooleanArray(n + 1)
    var primeCount = 0

    primeMap[2] = true
    primeCount++

    for (i in 3..n) {
        var isPrime = true
        for (j in 2..sqrt(i.toDouble()).toInt()) {
            if (primeMap[j] && i % j == 0) {
                isPrime = false
                break
            }
        }

        if (isPrime) {
            primeMap[i] = true
            primeCount++
        }
    }

    val primeCases = factorial(n = primeCount, mod = mod)
    val nonPrimeCases = factorial(n = n - primeCount, mod = mod)

    return ((primeCases.toLong() * nonPrimeCases.toLong()) % mod).toInt()
}

private fun factorial(n: Int, mod: Int): Int {
    if (n == 0) return 1

    var result = 1L
    var curr = n.toLong()
    while (curr > 0) {
        result *= curr
        result %= mod
        curr--
    }

    return result.toInt()
}
