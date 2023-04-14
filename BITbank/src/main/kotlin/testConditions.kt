// A function to test different conditions of an account balance and print a message accordingly.
fun testConditions(balance: Double) {
    when {
        balance > 0.0 -> println("Account balance is positive")
        balance == 0.0 -> println("Account balance is neutral")
        else -> println("Account balance is negative")
    }
}