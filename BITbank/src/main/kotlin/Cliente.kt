class Cliente(
    val name: String,
    val id: String,
    val password: Int
) : Authentication {
    override fun authentication(password: Int): Boolean {
        if(this.password == password){
            return true
        }
        return false
    }
}