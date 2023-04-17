fun testAuthentication() {
    val manager = Manager(
        name = "Hassan",
        id = "111.111.111-00",
        salary = 1000.0,
        password = 1000
    )
    val director = Director(
        name = "Augusto",
        id = "222.222.222-00",
        salary = 2000.0,
        password = 2000,
        plr = 200.0,
    )
    val cliente = Cliente(
        name = "Felipe",
        id = "333.333.333-00",
        password = 3000,
    )

    val system = InternalSystem()
    system.login(manager, password = 1000)
    system.login(director, password = 2000)
    system.login(cliente, password = 3000)


}
