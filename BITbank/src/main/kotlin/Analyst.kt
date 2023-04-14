class Analyst(
    name: String,
    id: String,
    salary: Double,
) : Employee(
    name = name,
    id = id,
    salary = salary
) {
    override fun bonus(): Double {
        return super.bonus() + salary * 0.1
    }
}