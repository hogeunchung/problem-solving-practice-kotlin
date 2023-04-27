package leetcode

fun halvesAreAlike(s: String): Boolean {
    val bowelSet = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    return s.take(s.length / 2).count { it in bowelSet } ==
            s.takeLast(s.length / 2).count { it in bowelSet }
}
