package leetcode

import kotlin.math.min

class Solution1710 {

    fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
        val unitToNumList = boxTypes
            .groupBy { (_, unit) -> unit }
            .mapValues { (_, nums) -> nums.sumOf { it[0] } }
            .toList()
            .sortedByDescending { (unit, _) -> unit }

        var remain = truckSize
        var count = 0
        unitToNumList.forEach { (unit, num) ->
            val minNum = min(num, remain)
            remain -= minNum
            count += unit * minNum
        }

        return count
    }
}
