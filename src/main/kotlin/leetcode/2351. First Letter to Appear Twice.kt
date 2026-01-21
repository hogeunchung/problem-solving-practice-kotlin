package leetcode

class Solution2351 {

    fun repeatedCharacter(s: String): Char {
        val appearedChars = hashSetOf<Char>()
        for (i in 0 until s.length) {
            if (appearedChars.contains(s[i])) {
                return s[i]
            }

            appearedChars.add(s[i])
        }

        error("No duplicated char")
    }
}
