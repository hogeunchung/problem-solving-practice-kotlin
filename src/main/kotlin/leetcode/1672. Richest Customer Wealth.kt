package leetcode

fun maximumWealth(accounts: Array<IntArray>): Int {
    return accounts.map { it.sum() }.sortedDescending().first()
}
