package leetcode

fun distributeCandies(candies: Int, num_people: Int): IntArray {
    val result = IntArray(num_people)
    var remainingCandyCount = candies
    var i = 0
    while (true) {
        val currCandyCount = i + 1
        if (remainingCandyCount < currCandyCount) {
            result[i % num_people] += remainingCandyCount
            return result
        }

        result[i % num_people] += currCandyCount
        remainingCandyCount -= currCandyCount
        i++
    }
}
