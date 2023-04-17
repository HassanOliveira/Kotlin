class Analyst(
    name: String,
    id: String,
    salary: Double,
) : Employee(
    name = name,
    id = id,
    salary = salary
) {
    override val bonus: Double
        get() {
            return salary * 0.1
        }
}