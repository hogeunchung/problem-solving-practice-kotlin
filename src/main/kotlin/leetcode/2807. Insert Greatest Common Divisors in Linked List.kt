package leetcode

import leetcode.dataStructure.ListNode

class Solution2807 {

    fun insertGreatestCommonDivisors(head: ListNode?): ListNode? {
        var curr = head
        while (curr?.next != null) {
            val gcd = calcGcd(curr.`val`, curr.next!!.`val`)

            val newNode = ListNode(gcd, curr.next)
            curr.next = newNode

            curr = curr.next?.next
        }

        return head
    }

    private fun calcGcd(a: Int, b: Int): Int =
        when {
            b == 0 -> a
            a >= b -> calcGcd(a - b, b)
            else -> calcGcd(b, a)
        }
}
