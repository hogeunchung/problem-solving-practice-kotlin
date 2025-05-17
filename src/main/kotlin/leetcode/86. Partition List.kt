package leetcode

import leetcode.dataStructure.ListNode

fun partition(head: ListNode?, x: Int): ListNode? {
    val leftHead = ListNode(-1)
    val rightHead = ListNode(-1)

    var curr = head
    var leftCurr = leftHead
    var rightCurr = rightHead

    while (curr != null) {
        val next = curr.next
        curr.next = null

        if (curr.`val` < x) {
            leftCurr.next = curr
            leftCurr = leftCurr.next!!
        } else {
            rightCurr.next = curr
            rightCurr = rightCurr.next!!
        }

        curr = next
    }

    leftCurr.next = rightHead.next
    return leftHead.next
}
