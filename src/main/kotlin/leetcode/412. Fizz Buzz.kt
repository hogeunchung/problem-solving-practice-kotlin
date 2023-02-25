package leetcode

fun fizzBuzz(n: Int): List<String> =
    IntArray(n) { num -> num + 1 }
        .map {
            if (it % 3 == 0 && it % 5 == 0) {
                "FizzBuzz"
            } else if (it % 3 == 0) {
                "Fizz"
            } else if (it % 5 == 0) {
                "Buzz"
            } else {
                it.toString()
            }
        }
