class InternalSystem {
    fun login(admin: Authentication, password: Int){
        if (admin.authentication(password)) {
            println("Welcome to BITBank")
        } else {
            println("Authentication failed")
        }
    }
}