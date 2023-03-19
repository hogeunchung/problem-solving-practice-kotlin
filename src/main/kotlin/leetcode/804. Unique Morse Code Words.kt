package leetcode

fun uniqueMorseRepresentations(words: Array<String>): Int {
    val codes = arrayOf(
        ".-",
        "-...",
        "-.-.",
        "-..",
        ".",
        "..-.",
        "--.",
        "....",
        "..",
        ".---",
        "-.-",
        ".-..",
        "--",
        "-.",
        "---",
        ".--.",
        "--.-",
        ".-.",
        "...",
        "-",
        "..-",
        "...-",
        ".--",
        "-..-",
        "-.--",
        "--.."
    )

    return words.map { word ->
        word.map { char ->
            codes[char.toInt() - 'a'.toInt()]
        }.joinToString(separator = "")
    }
        .distinct()
        .size
}
