fun testAccountFunctions() {
    val accountHassan = CheckingAccount(owner = "Hassan", numberAccount = 1000)
    accountHassan.deposit(200.0)

    val accountAugusto = SavingsAccount(numberAccount = 1001, owner = "Augusto")
    accountAugusto.deposit(300.0)

    println(accountAugusto.owner)
    println(accountAugusto.numberAccount)
    println(accountAugusto.balance)

    println(accountHassan.owner)
    println(accountHassan.numberAccount)
    println(accountHassan.balance)

    println("Depositing into Hassan's account")
    accountHassan.deposit(50.0)
    println(accountHassan.balance)

    println("Depositing into Augusto's account")
    accountAugusto.deposit(70.0)
    println(accountAugusto.balance)

    println("withdrawing from Hassan's account")
    accountHassan.withdrawal(250.0)
    println(accountHassan.balance)

    println("withdrawing from Augusto's account")
    accountAugusto.withdrawal(100.0)
    println(accountAugusto.balance)

    println("Hassan's account overdrawn")
    accountHassan.withdrawal(100.0)
    println(accountHassan.balance)

    println("Augusto's account overdrawn")
    accountAugusto.withdrawal(500.0)
    println(accountAugusto.balance)

    println("Transfer from Augusto's account to Hassan account")

    if (accountAugusto.transfer(destination = accountHassan, amount = 300.0)) {
        println("Successful Transfer")
    } else {
        println("Transfer failure")
    }

    println(accountHassan.balance)
    println(accountAugusto.balance)
}