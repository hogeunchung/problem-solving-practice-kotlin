package leetcode

fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
    return when (ruleKey) {
        "type" -> items.count { it[0] == ruleValue }
        "color" -> items.count { it[1] == ruleValue }
        "name" -> items.count { it[2] == ruleValue }
        else -> -1
    }
}