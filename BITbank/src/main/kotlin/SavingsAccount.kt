class SavingsAccount(
    owner: String,
    numberAccount: Int
) : Account(
    owner = owner,
    numberAccount = numberAccount
) {
    override fun withdrawal(amount: Double) {
        if(this.balance >= amount){
            this.balance -= amount
        }
    }
}