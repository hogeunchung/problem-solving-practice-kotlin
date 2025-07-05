package leetcode

import leetcode.dataStructure.ListNode

fun reorderList(head: ListNode?): Unit {
    var curr = head
    while (curr != null) {
        val next = curr.next

        var beforeLast: ListNode? = null
        var last = curr
        while (last?.next != null) {
            beforeLast = last
            last = last.next
        }

        beforeLast?.next = null
        if (last != next) last?.next = next
        if (curr != last) curr.next = last

        curr = next
    }
}
