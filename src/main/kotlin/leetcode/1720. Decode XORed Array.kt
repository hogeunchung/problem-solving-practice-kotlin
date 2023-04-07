package leetcode

fun decode(encoded: IntArray, first: Int): IntArray {
    var curr = first
    return (listOf(curr) + encoded.map {
        curr = it.xor(curr)
        curr
    }).toIntArray()
}
