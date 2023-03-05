package leetcode

import leetcode.dataStructure.ListNode

fun reverseList(head: ListNode?): ListNode? {
    return helper(prev = null, curr = head)
}

fun helper(prev: ListNode?, curr: ListNode?): ListNode? {
    if (curr == null) return prev

    val last = helper(prev = curr, curr = curr.next)
    curr.next = prev

    return last
}
