package leetcode.dataStructure

data class ListNode(var `val`: Int, var next: ListNode? = null) {
    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        return this === other
    }
}
