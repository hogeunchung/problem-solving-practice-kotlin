package leetcode

class Solution2894 {

    fun differenceOfSums(n: Int, m: Int): Int {
        val (indivisibleNums, divisibleNums) = (1..n).partition { it % m != 0 }
        return indivisibleNums.sum() - divisibleNums.sum()
    }
}
