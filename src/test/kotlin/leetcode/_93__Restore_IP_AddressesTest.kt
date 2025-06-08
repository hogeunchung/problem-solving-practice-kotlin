package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class _93__Restore_IP_AddressesTest {

    @Test
    fun test1() {
        // Given
        val expected = listOf("255.255.11.135", "255.255.111.35")

        // When
        val actual = restoreIpAddresses(s = "25525511135")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Given
        val expected = listOf("0.0.0.0")

        // When
        val actual = restoreIpAddresses(s = "0000")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Given
        val expected = listOf("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3")

        // When
        val actual = restoreIpAddresses(s = "101023")

        // Then
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        // Given
        val expected = emptyList<String>()

        // When
        val actual = restoreIpAddresses(s = "0279245587303")

        // Then
        assertEquals(expected, actual)
    }
}
