package leetcode

import kotlin.math.min

fun distanceBetweenBusStops(distance: IntArray, start: Int, destination: Int): Int {
    val n = distance.size

    if (start <= destination) {
        val clockwiseDistance = (start until destination)
            .fold(0) { acc, distIdx -> acc + distance[distIdx] }
        val counterclockwiseDistance = (destination until start + n)
            .fold(0) { acc, distIdx -> acc + distance[distIdx % n] }

        return min(clockwiseDistance, counterclockwiseDistance)
    } else {
        val clockwiseDistance = (start until destination + n)
            .fold(0) { acc, distIdx -> acc + distance[distIdx % n] }
        val counterclockwiseDistance = (destination until start)
            .fold(0) { acc, distIdx -> acc + distance[distIdx] }

        return min(clockwiseDistance, counterclockwiseDistance)
    }
}
