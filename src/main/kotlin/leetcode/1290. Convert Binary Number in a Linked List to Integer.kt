package leetcode

import leetcode.dataStructure.ListNode

class Solution1290 {

    fun getDecimalValue(head: ListNode?): Int {
        var num = 0
        var curr = head
        while (curr != null) {
            num *= 2
            num += curr.`val`
            curr = curr.next
        }

        return num
    }
}
