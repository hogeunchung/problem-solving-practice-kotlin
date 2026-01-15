package leetcode

class Solution2169 {

    fun countOperations(num1: Int, num2: Int): Int {
        return countOperations(num1 = num1, num2 = num2, operationCount = 0)
    }

    private fun countOperations(num1: Int, num2: Int, operationCount: Int): Int {
        if (num1 == 0 || num2 == 0) {
            return operationCount
        }

        return if (num1 >= num2) {
            countOperations(num1 = num1 - num2, num2 = num2, operationCount = operationCount + 1)
        } else {
            countOperations(num1 = num1, num2 = num2 - num1, operationCount = operationCount + 1)
        }
    }
}
