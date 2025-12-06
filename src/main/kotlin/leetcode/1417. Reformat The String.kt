package leetcode

class Solution1417 {

    fun reformat(s: String): String {
        val (digits, alphabets) = s.partition { it.isDigit() }

        return when {
            digits.length == alphabets.length -> {
                val result = StringBuilder()
                for (i in 0 until digits.length) {
                    result.append(digits[i])
                    result.append(alphabets[i])
                }
                result.toString()
            }

            digits.length == alphabets.length + 1 -> {
                val result = StringBuilder()
                for (i in 0 until alphabets.length) {
                    result.append(digits[i])
                    result.append(alphabets[i])
                }
                result.append(digits[digits.length - 1])
                result.toString()
            }

            digits.length + 1 == alphabets.length -> {
                val result = StringBuilder()
                for (i in 0 until digits.length) {
                    result.append(alphabets[i])
                    result.append(digits[i])
                }
                result.append(alphabets[alphabets.length - 1])
                result.toString()
            }

            else -> ""
        }
    }
}
