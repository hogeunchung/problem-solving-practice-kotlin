package leetcode

fun findCenter(edges: Array<IntArray>): Int {
    return edges[0].intersect(edges[1].toSet()).first()
}
