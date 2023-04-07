import org.junit.Assert.*
import org.junit.Test

class AccountTest {
    @Test
    fun `test deposit`() {
        val account = Account(owner = "Hassan", numberAccount = 1000)
        account.deposit(200.0)
        assertEquals(200.0, account.balance, 0.0)
    }

    @Test
    fun `test withdrawal with sufficient funds`() {
        val account = Account(owner = "Hassan", numberAccount = 1000)
        account.deposit(200.0)
        account.withdrawal(50.0)
        assertEquals(150.0, account.balance, 0.0)
    }

    @Test
    fun `test withdrawal with insufficient funds`() {
        val account = Account(owner = "Hassan", numberAccount = 1000)
        account.deposit(200.0)
        account.withdrawal(250.0)
        assertEquals(200.0, account.balance, 0.0)
    }

    @Test
    fun `test transfer with sufficient funds`() {
        val account1 = Account(owner = "Hassan", numberAccount = 1000)
        val account2 = Account(owner = "Augusto", numberAccount = 2000)
        account1.deposit(200.0)
        assertTrue(account1.transfer(amount = 60.0, destination = account2))
        assertEquals(140.0, account1.balance, 0.0)
        assertEquals(60.0, account2.balance, 0.0)
    }

    @Test
    fun `test transfer with insufficient funds`() {
        val account1 = Account(owner = "Hassan", numberAccount = 1000)
        val account2 = Account(owner = "Augusto", numberAccount = 2000)
        account1.deposit(50.0)
        assertFalse(account1.transfer(amount = 60.0, destination = account2))
        assertEquals(50.0, account1.balance, 0.0)
        assertEquals(0.0, account2.balance, 0.0)
    }
}
