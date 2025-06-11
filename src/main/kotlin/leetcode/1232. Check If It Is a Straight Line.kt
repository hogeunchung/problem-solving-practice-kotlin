package leetcode

fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
    val isVertical = coordinates[0][0] == coordinates[1][0]
    if (isVertical) {
        return coordinates.all { it[0] == coordinates[0][0] }
    }

    val initialSlope = calcSlope(p1 = coordinates[0], p2 = coordinates[1])

    for (i in 1 until coordinates.size - 1) {
        val slope = calcSlope(coordinates[i], coordinates[i + 1])
        if (slope == initialSlope || slope * initialSlope == 1.0) continue

        return false
    }

    return true
}

private fun calcSlope(p1: IntArray, p2: IntArray): Double =
    (p2[1] - p1[1]).toDouble() / (p2[0] - p1[0]).toDouble()
