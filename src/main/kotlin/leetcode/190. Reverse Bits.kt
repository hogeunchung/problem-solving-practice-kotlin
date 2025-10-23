package leetcode

class Solution190 {

    fun reverseBits(n: Int): Int {
        var result = 0
        var curr = n
        var i = 0
        while (curr > 0) {
            if (curr and 1 == 1) {
                result = result or (1 shl (32 - i - 1))
            }

            curr = curr shr 1
            i++
        }

        return result
    }
}
