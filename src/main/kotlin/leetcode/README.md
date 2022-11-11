### 733. Flood Fill

Use `ArrayDeque` instead of `LinkedList` for performance in coding tests.
Two reasons:

1. Time: Cache locality is generally good at an array.
2. Space: Doesn't need to save the information of the next node.
