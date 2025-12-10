package leetcode

class Solution3668 {

    fun recoverOrder(order: IntArray, friends: IntArray): IntArray {
        return order.filter { it in friends }.toIntArray()
    }
}
