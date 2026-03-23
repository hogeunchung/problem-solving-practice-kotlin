package leetcode

class Solution2710 {

    fun removeTrailingZeros(num: String): String {
        for (i in num.length - 1 downTo 0) {
            if (num[i] != '0') return num.take(i + 1)
        }

        return ""
    }
}
