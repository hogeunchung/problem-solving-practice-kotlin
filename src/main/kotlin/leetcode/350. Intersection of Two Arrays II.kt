package leetcode

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val counts1 = IntArray(1001) { 0 }
    val counts2 = IntArray(1001) { 0 }

    nums1.map { counts1[it]++ }
    nums2.map { counts2[it]++ }

    val result = mutableListOf<Int>()
    for (i in 0..1000) {
        if (counts1[i] >= counts2[i]) (0 until counts2[i]).map { result.add(i) }
        if (counts2[i] > counts1[i]) (0 until counts1[i]).map { result.add(i) }
    }

    return result.toIntArray()
}
