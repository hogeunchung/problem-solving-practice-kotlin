package leetcode

import kotlin.math.abs

class Solution1385 {

    fun findTheDistanceValue(arr1: IntArray, arr2: IntArray, d: Int): Int {
        return arr1.count { n1 -> arr2.all { n2 -> abs(n1 - n2) > d } }
    }
}
