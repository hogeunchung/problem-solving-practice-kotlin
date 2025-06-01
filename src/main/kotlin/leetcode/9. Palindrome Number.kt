package leetcode

fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false
    else if (x == 0) return true
    else if (x % 10 == 0) return false

    var curr = x
    var count = 0
    while (curr > 0) {
        count++
        curr /= 10
    }

    val width = count / 2
    if (count % 2 == 0) {
        for (i in 0 until width) {
            if ((x / pow(10, width - 1 - i)) % 10 != (x / pow(10, width + i)) % 10) return false
        }
    } else {
        for (i in 1..width) {
            if ((x / pow(10, width - i)) % 10 != (x / pow(10, width + i)) % 10) return false
        }
    }

    return true
}

private fun pow(base: Int, x: Int): Int {
    var curr = 1
    for (i in 0 until x) {
        curr *= base
    }

    return curr
}
