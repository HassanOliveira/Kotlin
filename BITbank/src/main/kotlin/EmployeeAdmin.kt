abstract class EmployeeAdmin(
    name: String,
    id: String,
    salary: Double,
    protected val password: Int,
) : Employee(
    name = name,
    id = id,
    salary = salary,
) {
    fun authentication(password: Int): Boolean {
        if(this.password == password){
            return true
        }
        return false
    }
}