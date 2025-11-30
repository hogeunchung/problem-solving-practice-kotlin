package leetcode

class Solution3541 {

    fun maxFreqSum(s: String): Int {
        val (vowel, consonant) = s.toCharArray().partition { it in setOf('a', 'e', 'i', 'o', 'u') }

        return (vowel
            .groupBy { it }
            .map { it.value.size }
            .maxOrNull() ?: 0) + (consonant
            .groupBy { it }
            .map { it.value.size }
            .maxOrNull() ?: 0)
    }
}
