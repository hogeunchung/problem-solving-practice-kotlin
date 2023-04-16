package leetcode

fun sumOddLengthSubarrays(arr: IntArray): Int {
    var result = 0
    (1..arr.size step 2).map { length ->
        (arr.indices).map { baseIdx ->
            if (baseIdx + length - 1 < arr.size) {
                (baseIdx until (baseIdx + length)).map { currIdx ->
                    result += arr[currIdx]
                }
            }
        }
    }
    return result
}
