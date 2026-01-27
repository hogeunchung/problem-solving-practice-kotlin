package leetcode

class Solution2652 {

    fun sumOfMultiples(n: Int): Int {
        return (1..n)
            .asSequence()
            .filter { it % 3 == 0 || it % 5 == 0 || it % 7 == 0 }
            .sum()
    }
}
