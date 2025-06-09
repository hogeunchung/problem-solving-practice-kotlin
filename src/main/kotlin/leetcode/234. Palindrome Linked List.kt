package leetcode

import leetcode.dataStructure.ListNode

fun isPalindrome(head: ListNode?): Boolean {
    var curr: ListNode? = head
    var reversedCurr: ListNode? = null
    var size = 0
    while (curr != null) {
        val tmp = ListNode(curr.`val`)
        tmp.next = reversedCurr
        reversedCurr = tmp

        curr = curr.next
        size++
    }

    curr = head
    for (i in 0 until size / 2) {
        if ((curr != null && reversedCurr == null) || (curr == null && reversedCurr != null)) return false
        if (curr?.`val` != reversedCurr?.`val`) return false
        if (curr == null) break

        curr = curr.next
        reversedCurr = reversedCurr?.next
    }

    return true
}
