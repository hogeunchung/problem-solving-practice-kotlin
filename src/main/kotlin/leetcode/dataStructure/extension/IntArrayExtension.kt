//package leetcode.dataStructure.extension
//
//import leetcode.dataStructure.ListNode
//
//fun IntArray.toListNodes(): ListNode? {
//    val head = ListNode(`val` = -1)
//    var curr = head
//    for (e in this) {
//        curr.next = ListNode(`val` = e)
//        curr = curr.next!!
//    }
//
//    return head.next
//}
