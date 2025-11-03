package leetcode

class Solution1629 {

    fun slowestKey(releaseTimes: IntArray, keysPressed: String): Char {
        val n = releaseTimes.size

        var maxReleaseTime = releaseTimes[0]
        val slowestKeys = mutableSetOf<Char>()
        slowestKeys.add(keysPressed[0])

        for (i in 1 until n) {
            val releaseTime = releaseTimes[i] - releaseTimes[i - 1]
            if (releaseTime > maxReleaseTime) {
                maxReleaseTime = releaseTime
                slowestKeys.clear()

                slowestKeys.add(keysPressed[i])
            } else if (releaseTimes[i] - releaseTimes[i - 1] == maxReleaseTime) {
                slowestKeys.add(keysPressed[i])
            }
        }

        return slowestKeys.sortedDescending()[0]
    }
}
