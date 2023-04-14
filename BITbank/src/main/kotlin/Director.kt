class Director(
    name: String,
    id: String,
    salary: Double,
    val password: Int,
    val plr: Double,
) : Employee(
    name = name,
    id = id,
    salary = salary
) {
    override fun bonus(): Double = super.bonus() + salary + plr

    fun authentication(password: Int): Boolean {
        if(this.password == password){
            return true
        }
        return false
    }
}