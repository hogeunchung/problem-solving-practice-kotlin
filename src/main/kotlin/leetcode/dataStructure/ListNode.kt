package leetcode.dataStructure

data class ListNode(var `val`: Int, var next: ListNode? = null) {
    override fun equals(other: Any?): Boolean {
        if ((other is ListNode).not()) return false
        other as ListNode

        var thisCurr: ListNode? = this
        var otherCurr: ListNode? = other
        while (thisCurr != null) {
            if (thisCurr.`val` != otherCurr?.`val`) return false

            thisCurr = thisCurr.next
            otherCurr = otherCurr.next
        }

        return true
    }
}
