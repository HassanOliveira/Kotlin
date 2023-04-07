fun main(args: Array<String>) {
    println("Welcome to BITbank")
}

// A class to define an account with an owner name, account number, and balance.
class Account(
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
    fun withdrawal(amount: Double) {
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

// A function to test a loop to create and print information about five accounts with different balances.
fun testLoop() {
    for (i in 1..5) {
        val owner = "Hassan $i"
        val numberAccount = 1000 + i
        var balance = i + 10.0

        println("Owner: $owner")
        println("Number Account: $numberAccount")
        println("Account Balance: $balance")
        println()
    }
}

// A function to test different conditions of an account balance and print a message accordingly.
fun testConditions(balance: Double) {
    when {
        balance > 0.0 -> println("Account balance is positive")
        balance == 0.0 -> println("Account balance is neutral")
        else -> println("Account balance is negative")
    }
}

