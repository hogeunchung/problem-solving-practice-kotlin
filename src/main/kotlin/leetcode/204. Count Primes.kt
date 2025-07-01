package leetcode

import kotlin.math.sqrt

fun countPrimes(n: Int): Int {
    if (n <= 2) return 0

    val primes = mutableListOf<Int>()

    primes.add(2)
    var count = 1

    var i = 3
    while (i < n) {
        if (isPrime(num = i, primes = primes)) {
            primes.add(i)
            count++
        }
        i += 2
    }

    return count
}

private fun isPrime(num: Int, primes: List<Int>): Boolean {
    val sqrt = sqrt(num.toDouble())

    for (i in 0 until primes.size) {
        if (primes[i] > sqrt) break
        if (num % primes[i] == 0) return false
    }

    return true
}
