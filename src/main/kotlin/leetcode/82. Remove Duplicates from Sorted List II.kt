package leetcode

import leetcode.dataStructure.ListNode

fun deleteDuplicates2(head: ListNode?): ListNode? {
    val prehead = ListNode(0)
    prehead.next = head

    var before = prehead
    var curr = head
    while (curr != null) {
        if (curr.`val` == curr.next?.`val`) {
            var innerCurr = curr
            while (innerCurr != null && innerCurr.`val` == innerCurr.next?.`val`) {
                innerCurr = innerCurr.next
            }
            before.next = innerCurr?.next
        } else {
            before = curr
        }
        curr = before.next
    }

    return prehead.next
}
