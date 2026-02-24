package leetcode

import leetcode.dataStructure.ListNode

class Solution2181 {

    fun mergeNodes(head: ListNode?): ListNode? {
        val mergedHead = ListNode(-1)
        var mergedCurr = mergedHead

        var curr = head?.next
        var mergedSum = 0

        while (curr != null) {
            if (curr.`val` != 0) {
                mergedSum += curr.`val`
                curr = curr.next
            } else {
                val newNode = ListNode(mergedSum)
                mergedCurr.next = newNode
                mergedCurr = newNode
                curr = curr.next
                mergedSum = 0
            }
        }

        return mergedHead.next
    }
}
