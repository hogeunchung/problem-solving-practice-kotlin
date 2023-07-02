package leetcode

fun countSegments(s: String): Int {
    return s.split(" ")
        .filterNot { it.isEmpty() }
        .size
}
