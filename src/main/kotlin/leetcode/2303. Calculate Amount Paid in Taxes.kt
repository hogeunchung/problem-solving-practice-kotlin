package leetcode

fun calculateTax(brackets: Array<IntArray>, income: Int): Double {
    var remains = income
    var prevUpper = 0
    var result = 0.0
    for (bracket in brackets) {
        val currUpper = bracket[0]
        val upperDiff = currUpper - prevUpper
        if (remains <= upperDiff) {
            result += remains * bracket[1]
            break
        } else {
            result += upperDiff * bracket[1]
            remains -= upperDiff
        }
        prevUpper = currUpper
    }
    return result / 100.0
}
