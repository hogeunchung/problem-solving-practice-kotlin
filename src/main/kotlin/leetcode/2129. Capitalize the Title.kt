package leetcode

class Solution2129 {

    fun capitalizeTitle(title: String): String {
        return title
            .split(' ')
            .map { it.lowercase() }
            .joinToString(" ") {
                if (it.length <= 2) it
                else it[0].uppercase() + it.substring(1)
            }
    }
}
