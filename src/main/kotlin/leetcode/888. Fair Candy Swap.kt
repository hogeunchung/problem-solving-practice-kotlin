package leetcode

class Solution888 {

    fun fairCandySwap(aliceSizes: IntArray, bobSizes: IntArray): IntArray {
        val gap = (aliceSizes.sum() - bobSizes.sum()) / 2
        val bobSizeSet = bobSizes.toHashSet()

        for (i in 0 until aliceSizes.size) {
            if (bobSizeSet.contains(aliceSizes[i] - gap)) {
                return intArrayOf(aliceSizes[i], aliceSizes[i] - gap)
            }
        }

        error("Problem condition error")
    }
}
