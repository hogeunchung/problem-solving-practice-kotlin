package leetcode

class Solution2180 {

    fun countEven(num: Int): Int {
        return (2..num).map { digitSum(it) }.count { it % 2 == 0 }
    }

    private fun digitSum(num: Int): Int {
        var curr = num
        var sum = 0
        while (curr > 0) {
            sum += curr % 10
            curr /= 10
        }

        return sum
    }
}
