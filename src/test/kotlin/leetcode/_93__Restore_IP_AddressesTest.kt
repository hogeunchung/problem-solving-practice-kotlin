package leetcode

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class _93__Restore_IP_AddressesTest {

    @Test
    fun test1() {
        // Arrange
        val expected = listOf("255.255.11.135", "255.255.111.35")

        // Act
        val actual = restoreIpAddresses(s = "25525511135")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        // Arrange
        val expected = listOf("0.0.0.0")

        // Act
        val actual = restoreIpAddresses(s = "0000")

        // Assert
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        // Arrange
        val expected = listOf("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3")

        // Act
        val actual = restoreIpAddresses(s = "101023")

        // Assert
        assertEquals(expected, actual)
    }
}
