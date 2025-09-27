package leetcode

fun removeDuplicates(s: String): String {
    val curr = StringBuilder(s)

    var i = 0
    while (true) {
        if (i >= curr.length - 1) return curr.toString()

        if (curr[i] == curr[i + 1]) {
            curr.delete(i, i + 2)
            if (i != 0) i -= 1
        } else {
            i++
        }
    }
}
