package leetcode

class Solution999 {

    fun numRookCaptures(board: Array<CharArray>): Int {
        var rookRank = -1
        var rookFile = -1

        for (rank in 0 until 8) {
            for (file in 0 until 8) {
                if (board[rank][file] == 'R') {
                    rookRank = rank
                    rookFile = file
                }
            }
        }

        var result = 0
        for (rank in rookRank + 1 until 8) {
            when (board[rank][rookFile]) {
                '.' -> continue
                'p' -> {
                    result++
                    break
                }

                else -> break
            }
        }
        for (rank in rookRank - 1 downTo 0) {
            when (board[rank][rookFile]) {
                '.' -> continue
                'p' -> {
                    result++
                    break
                }

                else -> break
            }
        }
        for (file in rookFile + 1 until 8) {
            when (board[rookRank][file]) {
                '.' -> continue
                'p' -> {
                    result++
                    break
                }

                else -> break
            }
        }
        for (file in rookFile - 1 downTo 0) {
            when (board[rookRank][file]) {
                '.' -> continue
                'p' -> {
                    result++
                    break
                }

                else -> break
            }
        }

        return result
    }
}
