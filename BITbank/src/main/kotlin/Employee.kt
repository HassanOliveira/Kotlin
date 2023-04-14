open class Employee(
    val name: String,
    val id: String,
    val salary: Double,
) {
    open fun bonus(): Double {
        return salary * 0.1
    }
}