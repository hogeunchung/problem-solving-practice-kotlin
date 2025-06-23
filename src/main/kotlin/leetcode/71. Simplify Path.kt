package leetcode

fun simplifyPath(path: String): String {
    val directoryElements = path
        .split("/")
        .filterNot { it.isEmpty() }
        .toMutableList()

    var size = directoryElements.size
    var curr = 0
    while (curr < size) {
        when (directoryElements[curr]) {
            ".." -> {
                directoryElements.removeAt(curr)
                size--

                if (0 <= curr - 1) {
                    directoryElements.removeAt(curr - 1)
                    curr--
                    size--
                }
            }

            "." -> {
                directoryElements.removeAt(curr)
                size--
            }

            else -> {
                curr++
            }
        }
    }

    return "/" + directoryElements.joinToString("/")
}
