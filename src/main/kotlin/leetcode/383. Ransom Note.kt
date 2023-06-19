package leetcode

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val countMap = mutableMapOf<Char, Int>()
    magazine.map { countMap[it] = (countMap[it] ?: 0) + 1 }
    ransomNote.map {
        if (countMap.contains(it).not()) return false
        if (countMap[it] == 0) return false
        countMap[it] = countMap[it]!! - 1
    }
    return true
}
