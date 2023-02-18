package leetcode

fun titleToNumber(columnTitle: String) =
    columnTitle.mapIndexed { i, ch ->
        (ch.toInt() - 'A'.toInt() + 1) * (0 until columnTitle.length - i - 1).fold(1) { total, _ -> total * 26 }
    }.sum()
