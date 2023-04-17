class CheckingAccount(
    owner: String,
    numberAccount: Int
) : Account(
    owner = owner,
    numberAccount = numberAccount
) {
    override fun withdrawal(amount: Double) {
        val amountWithTax = amount + 0.1
        if(this.balance >= amountWithTax){
            this.balance -= amountWithTax
        }
    }
}