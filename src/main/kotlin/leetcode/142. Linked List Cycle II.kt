package leetcode

import leetcode.dataStructure.ListNode

fun detectCycle1(head: ListNode?): ListNode? {
    var curr = head
    var count = 0
    while (curr != null) {
        var traceCurr = head
        var traceCount = 0
        while (true) {
            if (curr == traceCurr && traceCount == count) break
            if (curr == traceCurr) return curr

            traceCurr = traceCurr?.next
            traceCount++
        }

        curr = curr.next
        count++
    }

    return null
}

// Two pointers
fun detectCycle(head: ListNode?): ListNode? {
    var slowPointer = head?.next
    var fastPointer = head?.next?.next

    while (true) {
        if (fastPointer == null) return null
        if (slowPointer == fastPointer) break

        slowPointer = slowPointer?.next
        fastPointer = fastPointer.next?.next
    }

    var p1 = head
    var p2 = fastPointer
    while (true) {
        if (p1 == p2) return p1

        p1 = p1?.next
        p2 = p2?.next
    }
}
