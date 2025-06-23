package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class _71__Simplify_PathTest {

    @Test
    fun test1() {
        // Given
        val expected = "/home"

        // When
        val actual = simplifyPath(path = "/home/")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = "/home/foo"

        // When
        val actual = simplifyPath(path = "/home//foo/")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = "/home/user/Pictures"

        // When
        val actual = simplifyPath(path = "/home/user/Documents/../Pictures")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = "/"

        // When
        val actual = simplifyPath(path = "/../")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test5() {
        // Given
        val expected = "/.../b/d"

        // When
        val actual = simplifyPath(path = "/.../a/../b/c/../d/./")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test6() {
        // Given
        val expected = "/c"

        // When
        val actual = simplifyPath(path = "/a/../../b/../c//.//")

        // Then
        assertEquals(expected, actual)
    }
}
