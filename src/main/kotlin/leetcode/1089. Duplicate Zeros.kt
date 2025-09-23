package leetcode

fun duplicateZeros(arr: IntArray): Unit {
    val queue = mutableListOf<Int>()
    var i = 0
    while (i < arr.size) {
        if (queue.isNotEmpty()) queue.add(arr[i])
        val next = if (queue.isEmpty()) arr[i] else queue.removeFirst()

        arr[i] = next
        if (next == 0) {
            if (i + 1 >= arr.size) break

            queue.add(arr[i + 1])
            arr[i + 1] = 0
            i++
        }

        i++
    }
}
