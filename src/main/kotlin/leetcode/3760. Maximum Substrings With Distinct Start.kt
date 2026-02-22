package leetcode

class Solution3760 {

    fun maxDistinct(s: String): Int {
        return s
            .toCharArray()
            .distinct()
            .size
    }
}
