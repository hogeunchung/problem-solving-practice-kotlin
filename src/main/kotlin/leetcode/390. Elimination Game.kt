package leetcode

/**
 * 1 / 1
 * 2 / 2
 * 3
 * 4 / 2,4 / 2
 * 5
 * 6 / 2,4,6 / 4
 * 7
 * 8 / 2,4,6,8 / 2,6 / 6
 * 9
 * 10 / 2,4,6,8,10 / 4,8 / 8
 * 11
 * 12 / 2,4,6,8,10,12 / 2,6,10 / 6
 * 13
 * 14 / 2,4,6,8,10,12,14 / 4,8,12 / 8
 * 15
 * 16 / 2,4,6,8,10,12,14,16 / 2,6,10,14 / 6,14 / 6
 * 17
 * 18 / 2,4,6,8,10,12,14,16,18 / 4,8,12,16 / 8,16 / 8
 * 19
 * 20 / 2,4,6,8,10,12,14,16,18,20 / 2,6,10,14,18 / 6,14 / 6
 * 21
 * 22 / 2,4,6,8,10,12,14,16,18,20,22 / 4,8,12,16,20 / 8,16 / 8
 * 23
 * 24 / 2,4,6,8,10,12,14,16,18,20,22,24 / 2,6,10,14,18,22 / 6,14,22 / 14
 */
fun lastRemaining(n: Int): Int {
    if (n == 1) return 1

    var orient = 0 // 0: left-to-right, 1: right-to-left
    var gap = 2
    var curr = 0
    while (true) {
        when (orient) {
            0 -> {
                var eliminationCount = 0
                while (true) {
                    curr += gap
                    if (curr > n)
                        break

                    eliminationCount++
                }

                if (eliminationCount == 1)
                    return curr - gap
            }

            1 -> {
                var eliminationCount = 0
                while (true) {
                    curr -= gap
                    if (curr < 1)
                        break

                    eliminationCount++
                }

                if (eliminationCount == 1)
                    return curr + gap
            }
        }

        gap *= 2
        orient = 1 - orient
    }
}
