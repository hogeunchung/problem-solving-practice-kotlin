package leetcode

class Solution3099 {

    fun sumOfTheDigitsOfHarshadNumber(x: Int): Int {
        var sumOfDigits = 0
        var curr = x
        while (curr > 0) {
            sumOfDigits += curr % 10
            curr /= 10
        }

        return if (x % sumOfDigits == 0) sumOfDigits else -1
    }
}
