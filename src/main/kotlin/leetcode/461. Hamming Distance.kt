package leetcode

fun hammingDistance(x: Int, y: Int): Int {
    var curr = x.xor(y)
    var hammingDistance = 0
    while (curr > 0) {
        if (curr % 2 == 1) hammingDistance++
        curr = curr.shr(1)
    }
    return hammingDistance
}
