package leetcode

import leetcode.dataStructure.ListNode

fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
    var currA = headA
    while (currA != null) {
        var currB = headB
        while (currB != null) {
            if (currA == currB) {
                return currA
            }
            currB = currB.next
        }
        currA = currA.next
    }

    return null
}
