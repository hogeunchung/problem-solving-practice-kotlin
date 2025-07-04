package leetcode

import leetcode.dataStructure.ListNode

fun detectCycle(head: ListNode?): ListNode? {
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
