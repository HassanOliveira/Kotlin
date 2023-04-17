class Director(
    name: String,
    id: String,
    salary: Double,
    password: Int,
    val plr: Double,
) : EmployeeAdmin(
    name = name,
    id = id,
    salary = salary,
    password = password,
), Authentication {
    override val bonus: Double
        get() {
            return salary + plr
        }
}