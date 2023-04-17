class BonusCalculator {
    var total: Double = 0.0
        private set

    fun register(employee: Employee) {
        this.total += employee.bonus
    }
}