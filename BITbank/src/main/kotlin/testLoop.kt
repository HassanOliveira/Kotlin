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