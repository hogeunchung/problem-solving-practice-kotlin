package leetcode

class Solution2678 {

    fun countSeniors(details: Array<String>): Int {
        return details.count { it[11] >= '7' || (it[11] >= '6' && it[12] > '0') }
    }
}
