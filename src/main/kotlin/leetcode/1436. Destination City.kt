package leetcode

fun destCity(paths: List<List<String>>): String {
    val sourceCitySet = mutableSetOf<String>()
    val destinationCitySet = mutableSetOf<String>()

    paths.forEach{
        sourceCitySet.add(it[0])
        destinationCitySet.add(it[1])
    }

    return destinationCitySet.minus(sourceCitySet).first()
}
