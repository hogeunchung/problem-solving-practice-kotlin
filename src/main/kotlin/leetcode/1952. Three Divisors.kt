package leetcode

fun isThree(n: Int): Boolean {
    var count = 1

    if (n % 2 == 0) {
        count++
        for (i in 3..n) {
            if (n % i == 0) {
                count++
                if (count > 3) {
                    return false
                }
            }
        }
    } else {
        for (i in 3..n step 2) {
            if (n % i == 0) {
                count++
                if (count > 3) {
                    return false
                }
            }
        }
    }

    return count == 3
}
