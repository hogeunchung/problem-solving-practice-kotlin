package leetcode

class Solution1518 {

    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
        var count = numBottles
        var currEmptyBottles = numBottles

        while (currEmptyBottles / numExchange > 0) {
            count += currEmptyBottles / numExchange
            currEmptyBottles = currEmptyBottles / numExchange + currEmptyBottles % numExchange
        }

        return count
    }
}
