package leetcode

fun findLucky(arr: IntArray): Int {
    val countMap = mutableMapOf<Int, Int>()
    arr.map {
        if (countMap.containsKey(it).not()) countMap[it] = 0
        countMap[it] = countMap[it]!! + 1
    }

    var maxNum = -1
    countMap.map { entry ->
        if (entry.key == entry.value) {
            maxNum = if (maxNum >= entry.key) maxNum else entry.key
        }
    }

    return maxNum
}
