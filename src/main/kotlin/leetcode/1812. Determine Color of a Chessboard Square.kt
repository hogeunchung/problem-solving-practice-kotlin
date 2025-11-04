package leetcode

class Solution1812 {

    fun squareIsWhite(coordinates: String): Boolean {
        return ((coordinates[0] - 'a') + (coordinates[1].digitToInt() - 1)) % 2 == 1
    }
}
