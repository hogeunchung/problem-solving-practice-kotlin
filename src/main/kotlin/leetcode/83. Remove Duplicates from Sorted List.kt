package leetcode

import leetcode.dataStructure.ListNode

fun deleteDuplicates(head: ListNode?): ListNode? {
    var curr = head
    while (curr != null) {
        if (curr.next != null && curr.`val` == curr.next!!.`val`) {
            curr.next = curr.next!!.next
        } else {
            curr = curr.next
        }
    }

    return head
}
