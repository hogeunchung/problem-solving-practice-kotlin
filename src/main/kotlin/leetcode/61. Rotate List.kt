package leetcode

import leetcode.dataStructure.ListNode

fun rotateRight(head: ListNode?, k: Int): ListNode? {
    if (head == null) return null

    var last: ListNode? = null
    var curr = head
    var size = 0
    while (curr != null) {
        size++
        last = curr
        curr = curr.next
    }
    last?.next = head

    val rotateCount = size - k % size
    var newHead = head
    var before: ListNode? = null
    repeat(rotateCount) {
        before = newHead
        newHead = newHead!!.next
    }
    before?.next = null

    return newHead
}
