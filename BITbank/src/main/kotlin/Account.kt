// A class to define an account with an owner name, account number, and balance.
open class Account(
    val owner: String,
    val numberAccount: Int
) {
    // The account balance, which can be accessed but not set outside the class.
    var balance = 0.0
        private set

    // A function to deposit a given amount into the account, but only if the amount is positive.
    fun deposit(amount: Double) {
        if(amount > 0) {
            this.balance += amount
        }
    }

    // A function to withdraw a given amount from the account, but only if the balance is sufficient.
    open fun withdrawal(amount: Double) {
        if (balance >= amount) {
            this.balance -= amount
        }
    }

    // A function to transfer a given amount from this account to another account, but only if the balance is sufficient.
    fun transfer(amount: Double, destination: Account): Boolean {
        if (balance >= amount) {
            balance -= amount
            destination.deposit(amount)
            return true
        }
        return false
    }
}