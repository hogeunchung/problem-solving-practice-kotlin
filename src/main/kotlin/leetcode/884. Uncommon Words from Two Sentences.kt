package leetcode

class Solution884 {

    fun uncommonFromSentences(s1: String, s2: String): Array<String> {
        val s1WordCounts = s1.split(" ").groupingBy { it }.eachCount()
        val s2WordCounts = s2.split(" ").groupingBy { it }.eachCount()

        val s1OnlyWords = s1WordCounts.keys - s2WordCounts.keys
        val s2OnlyWords = s2WordCounts.keys - s1WordCounts.keys

        val s1UncommonWords = s1WordCounts.filter { it.key in s1OnlyWords }.filter { it.value == 1 }.keys
        val s2UncommonWords = s2WordCounts.filter { it.key in s2OnlyWords }.filter { it.value == 1 }.keys

        return (s1UncommonWords + s2UncommonWords).toTypedArray()
    }
}
