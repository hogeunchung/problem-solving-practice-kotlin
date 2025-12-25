package leetcode

class Solution1700 {

    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
        var currStudentIdx = 0
        var currSandwichIdx = 0
        var uneatCount = 0
        val ateStudents = BooleanArray(students.size)

        while (currSandwichIdx < sandwiches.size && uneatCount != students.size) {
            if (ateStudents[currStudentIdx].not() && students[currStudentIdx] == sandwiches[currSandwichIdx]) {
                ateStudents[currStudentIdx] = true
                currSandwichIdx++
                uneatCount = 0
            } else {
                uneatCount++
            }
            currStudentIdx = (currStudentIdx + 1) % students.size
        }

        return students.size - ateStudents.count { it }
    }
}
