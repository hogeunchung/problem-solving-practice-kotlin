package leetcode

class Solution3823 {

    fun reverseByType(s: String): String {
        val chars = s.toCharArray()

        chars.doit { char -> char in 'a'..'z' }
        chars.doit { char -> char !in 'a'..'z' }

        return chars.joinToString("")
    }

    private fun CharArray.doit(isValid: (char: Char) -> Boolean) {
        var li = 0
        var ri = this.size - 1

        while (li < ri) {
            if (isValid(this[li]).not()) {
                li++
                continue
            }
            if (isValid(this[ri]).not()) {
                ri--
                continue
            }

            this.swap(li, ri)
            li++
            ri--
        }

    }

    private fun CharArray.swap(i: Int, j: Int) {
        val tmp = this[i]
        this[i] = this[j]
        this[j] = tmp
    }
}
