package leetcode

class Solution2578 {

    fun splitNum(num: Int): Int {
        val digits = mutableListOf<Int>()
        var curr = num
        while (curr > 0) {
            digits.add(curr % 10)
            curr /= 10
        }
        val sortedDigits = digits.sorted()

        var num1 = 0
        var num2 = 0
        for (i in 0 until sortedDigits.size / 2) {
            num1 = 10 * num1 + sortedDigits[2 * i]
            num2 = 10 * num2 + sortedDigits[2 * i + 1]
        }
        if (sortedDigits.size % 2 == 1) {
            if (num1 < num2) {
                num1 = 10 * num1 + sortedDigits[sortedDigits.size - 1]
            } else {
                num2 = 10 * num2 + sortedDigits[sortedDigits.size - 1]
            }
        }

        return num1 + num2
    }
}
