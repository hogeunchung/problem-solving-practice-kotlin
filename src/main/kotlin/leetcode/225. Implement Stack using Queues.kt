package leetcode

class MyStack() {

    var curr = mutableListOf<Int>()
    var standby = mutableListOf<Int>()

    fun push(x: Int) {
        curr.add(x)
    }

    fun pop(): Int {
        while (true) {
            val f = curr.removeFirst()
            if (curr.isEmpty()) {
                swap()
                return f
            }

            standby.add(f)
        }
    }

    fun top(): Int {
        while (true) {
            val first = curr.removeFirst()
            if (curr.isEmpty()) {
                standby.add(first)
                swap()
                return first
            }

            standby.add(first)
        }
    }

    fun empty(): Boolean {
        return curr.isEmpty()
    }

    private fun swap() {
        val tmp = curr
        curr = standby
        standby = tmp
    }
}
