package leetcode

import leetcode.dataStructure.ListNode

fun removeElements(head: ListNode?, `val`: Int): ListNode? {
    val preHead = ListNode(-1)
    preHead.next = head
    var curr: ListNode? = preHead
    while (curr != null) {
        if (curr.next != null && curr.next!!.`val` == `val`) {
            curr.next = curr.next!!.next
        } else {
            curr = curr.next
        }
    }
    return preHead.next
}
