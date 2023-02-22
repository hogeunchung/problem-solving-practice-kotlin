package leetcode

fun findContentChildren(g: IntArray, s: IntArray): Int {
    g.sort()
    s.sort()

    var count = 0
    var gi = 0
    var si = 0
    while (gi < g.size && si < s.size) {
        if (g[gi] <= s[si]) {
            count++
            gi++
        }
        si++
    }

    return count
}
