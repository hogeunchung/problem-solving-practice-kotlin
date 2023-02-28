package leetcode

import leetcode.dataStructure.ListNode

fun hasCycle(head: ListNode?): Boolean {
    var curr1 = head
    var curr2 = head

    while (true) {
        curr1 = curr1?.next
        curr2 = curr2?.next?.next

        if (curr1 == null || curr2 == null) {
            return false
        }

        if (curr1 == curr2) {
            return true
        }
    }
}
