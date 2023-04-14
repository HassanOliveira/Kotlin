fun main(args: Array<String>) {
    println("Welcome to BITbank")

    //testaFuncionarios()

    val checkingAccount = CheckingAccount(
        owner = "Alex",
        numberAccount = 1000
    )
    val savingsAccount = SavingsAccount(
        owner = "Fran",
        numberAccount = 1001
    )

    checkingAccount.deposit(amount = 1000.0)
    savingsAccount.deposit(amount = 1000.0)

    println("Balance checking account: ${checkingAccount.balance}")
    println("Balance savings account: ${savingsAccount.balance}")

    checkingAccount.withdrawal(amount = 100.0)
    savingsAccount.withdrawal(amount = 100.0)

    println("Balance checking account after withdrawal: ${checkingAccount.balance}")
    println("Balance savings account after withdrawal: ${savingsAccount.balance}")

    checkingAccount.transfer(amount = 100.0, savingsAccount)

    println("Balance checking account after transfer to savings account: ${checkingAccount.balance}")
    println("Balance savings account: ${savingsAccount.balance}")
}

