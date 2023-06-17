package leetcode

fun wordPattern(pattern: String, s: String): Boolean {
    val words = s.split(" ")
    if (pattern.length != words.size) return false

    val matchMap = mutableMapOf<Char, String>()
    pattern.mapIndexed { index, key ->
        if (matchMap.contains(key)) {
            if (matchMap[key] != words[index]) {
                return false
            }
        } else {
            matchMap[key] = words[index]
        }
    }

    return matchMap.values.size == matchMap.values.toSet().size
}
