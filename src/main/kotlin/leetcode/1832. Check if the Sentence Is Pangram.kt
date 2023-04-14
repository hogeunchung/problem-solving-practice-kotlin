package leetcode

fun checkIfPangram(sentence: String): Boolean {
    val appearance = BooleanArray(26)
    sentence.map { appearance[it.toInt() - 'a'.toInt()] = true }
    return appearance.all { it }
}
