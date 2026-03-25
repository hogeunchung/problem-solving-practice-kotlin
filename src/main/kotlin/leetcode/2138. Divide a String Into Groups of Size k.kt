package leetcode

class Solution2138 {

    fun divideString(s: String, k: Int, fill: Char): Array<String> {
        val chunked = s.chunked(k).toMutableList()
        val n = chunked.size
        if (chunked[n - 1].length < k) {
            chunked[n - 1] += (1..k - chunked[n - 1].length).map { fill }.joinToString("")
        }

        return chunked.toTypedArray()
    }
}
