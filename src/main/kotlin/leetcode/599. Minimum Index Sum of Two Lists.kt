package leetcode

fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
    val n1 = list1.size
    val n2 = list2.size

    for (s in 0 until n1 + n2) {
        val result = mutableListOf<String>()

        for (i in 0..s) {
            if (i < n1 && s - i < n2 && list1[i] == list2[s - i]) {
                result.add(list1[i])
            }
        }

        if (result.isNotEmpty()) {
            return result.toTypedArray()
        }
    }

    return emptyList<String>().toTypedArray()
}
