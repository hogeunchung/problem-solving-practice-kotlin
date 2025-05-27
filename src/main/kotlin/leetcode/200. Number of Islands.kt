package leetcode

// Graph
fun numIslands1(grid: Array<CharArray>): Int {
    val m = grid.size
    val n = grid[0].size
    val nodeMap = mutableMapOf<Int, Node>()

    for (mi in 0 until m) {
        for (ni in 0 until n) {
            if (grid[mi][ni] == '1') {
                val newNode = Node(idx = mi * n + ni)

                nodeMap[mi * n + ni] = newNode
                if (mi > 0) {
                    val upNode = nodeMap[(mi - 1) * n + ni]
                    if (upNode != null) {
                        upNode.addAdjacentNode(adjacentNode = newNode)
                        newNode.addAdjacentNode(adjacentNode = upNode)
                    }
                }
                if (ni > 0) {
                    val leftNode = nodeMap[mi * n + (ni - 1)]
                    if (leftNode != null) {
                        leftNode.addAdjacentNode(adjacentNode = newNode)
                        newNode.addAdjacentNode(adjacentNode = leftNode)
                    }
                }
            }
        }
    }

    var count = 0
    val visitMap = mutableMapOf<Int, Boolean>()
    nodeMap.values.forEach { node ->
        if (visitMap[node.idx] == null) {
            visitMap[node.idx] = true
            count++
            visit1(node.adjacentNodes, visitMap = visitMap)
        }
    }

    return count
}

private fun visit1(nodes: List<Node>, visitMap: MutableMap<Int, Boolean>) {
    nodes.forEach { node ->
        if (visitMap[node.idx] == null) {
            visitMap[node.idx] = true
            visit1(nodes = node.adjacentNodes, visitMap = visitMap)
        }
    }
}

private data class Node(
    val idx: Int,
    val adjacentNodes: MutableList<Node> = mutableListOf(),
) {

    fun addAdjacentNode(adjacentNode: Node) {
        adjacentNodes.add(adjacentNode)
    }
}

// Without graph
fun numIslands(grid: Array<CharArray>): Int {
    val m = grid.size
    val n = grid[0].size
    val visits = BooleanArray(m * n)

    var count = 0
    for (mi in 0 until m) {
        for (ni in 0 until n) {
            if (grid[mi][ni] == '1' && visits[mi * n + ni].not()) {
                count++
                visit(mi, ni, grid, visits, m, n)
            }
        }
    }

    return count
}

private fun visit(mi: Int, ni: Int, grid: Array<CharArray>, visits: BooleanArray, m: Int, n: Int) {
    if (visits[mi * n + ni]) return

    visits[mi * n + ni] = true
    if (mi > 0 && grid[mi - 1][ni] == '1') {
        visit(mi - 1, ni, grid, visits, m, n)
    }
    if (ni > 0 && grid[mi][ni - 1] == '1') {
        visit(mi, ni - 1, grid, visits, m, n)
    }
    if (mi < m - 1 && grid[mi + 1][ni] == '1') {
        visit(mi + 1, ni, grid, visits, m, n)
    }
    if (ni < n - 1 && grid[mi][ni + 1] == '1') {
        visit(mi, ni + 1, grid, visits, m, n)
    }
}
