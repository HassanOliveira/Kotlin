open class Manager (
    name: String,
    id: String,
    salary: Double,
    password: Int
) : EmployeeAdmin(
    name = name,
    id = id,
    salary = salary,
    password = password,
), Authentication {
    override val bonus: Double
        get() {
            return salary
        }
}