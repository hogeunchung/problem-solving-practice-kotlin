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

fun getIntersectionNodeImproved(headA: ListNode?, headB: ListNode?): ListNode? {
    var lenA = 0
    var currA = headA
    while (currA != null) {
        currA = currA.next
        lenA++
    }

    var lenB = 0
    var currB = headB
    while (currB != null) {
        currB = currB.next
        lenB++
    }

    currA = headA
    currB = headB
    if (lenA > lenB) {
        for (i in 1..(lenA - lenB)) {
            currA = currA?.next
        }
    } else {
        for (i in 1..(lenB - lenA)) {
            currB = currB?.next
        }
    }

    while (currA != null && currB != null) {
        if (currA == currB) {
            return currA
        }

        currA = currA.next
        currB = currB.next
    }

    return null
}
