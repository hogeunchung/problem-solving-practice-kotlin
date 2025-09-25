package leetcode

fun maximum69Number(num: Int): Int {
    var curr = num
    var figure = 1
    var maxFigureWithSix = 0
    while (curr > 0) {
        if (curr % 10 == 6) maxFigureWithSix = figure

        figure *= 10
        curr /= 10
    }

    return num + maxFigureWithSix * 3
}
