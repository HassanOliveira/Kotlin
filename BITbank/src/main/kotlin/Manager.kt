class Manager (
    name: String,
    id: String,
    salary: Double,
    val password: Int
) : Employee(
    name = name,
    id = id,
    salary = salary
) {
    override fun bonus(): Double {
        return super.bonus() + salary
    }

    fun authentication(password: Int): Boolean {
        if(this.password == password){
            return true
        }
        return false
    }
}