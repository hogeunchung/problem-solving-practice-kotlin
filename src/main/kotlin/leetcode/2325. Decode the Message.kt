package leetcode

class Solution2325 {

    fun decodeMessage(key: String, message: String): String {
        val decodeMap = CharArray(26)
        val visit = hashSetOf<Char>()

        var curr = 0
        for (i in 0 until key.length) {
            val char = key[i]
            if (curr == 26) break
            if (char !in 'a'..'z') continue

            if (visit.contains(char).not()) {
                decodeMap[curr++] = char
                visit.add(char)
            }
        }

        return message
            .map { char ->
                if (decodeMap.contains(char)) 'a' + decodeMap.indexOf(char)
                else char
            }
            .joinToString("")
    }
}
