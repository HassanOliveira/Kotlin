abstract class Employee(
    val name: String,
    val id: String,
    val salary: Double,
) {
    abstract val bonus: Double
}