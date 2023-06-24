package leetcode

fun isPerfectSquare(num: Int): Boolean {
    val target = num.toLong()
    (1L..target).map {
        val square = it * it
        if (square == target) return true
        else if (square > target) return false
    }

    return false
}
