package leetcode

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = mutableMapOf<String, List<String>>()

    strs.forEach { str ->
        val key = str.toCharArray().sorted().joinToString()
        map[key] = map.getOrDefault(key, emptyList()) + str
    }

    return map.values.toList()
}
