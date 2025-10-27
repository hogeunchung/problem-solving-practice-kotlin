package leetcode

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import kotlin.math.abs

class Solution1360 {

    fun daysBetweenDates(date1: String, date2: String): Int {
        val date1 = LocalDate.parse(date1, DateTimeFormatter.ISO_DATE)
        val date2 = LocalDate.parse(date2, DateTimeFormatter.ISO_DATE)

        return abs(date1.until(date2, ChronoUnit.DAYS).toInt())
    }
}
