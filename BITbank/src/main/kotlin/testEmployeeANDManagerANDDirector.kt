fun testaFuncionarios() {
    val hassan = Analyst(
        name = "Hassan",
        id = "111.111.111-11",
        salary = 1000.0
    )

    println("name: ${hassan.name}")
    println("id: ${hassan.id}")
    println("salary: ${hassan.salary}")
    println("bonus: ${hassan.bonus()}")

    val augusto = Manager(
        name = "Augusto",
        id = "222.222.222-22",
        salary = 2000.0,
        password = 1234
    )

    println("name: ${augusto.name}")
    println("id: ${augusto.id}")
    println("salary: ${augusto.salary}")
    println("bonus: ${augusto.bonus()}")

    if (augusto.authentication(1234)) {
        println("successfully authenticated")
    } else {
        println("authentication failure")
    }

    val charles = Director(
        name = "charles",
        id = "333.333.333-33",
        salary = 4000.0,
        password = 4000,
        plr = 200.0
    )

    println("name: ${charles.name}")
    println("id: ${charles.id}")
    println("salary: ${charles.salary}")
    println("bonus: ${charles.bonus()}")
    println("plr: ${charles.plr}")

    if (charles.authentication(4000)) {
        println("successfully authenticated")
    } else {
        println("authentication failure")
    }

    val marie = Analyst(
        name = "Marie",
        id = "444.444.444-44",
        salary = 3000.0
    )

    val calculator = BonusCalculator()
    calculator.register(hassan)
    calculator.register(augusto)
    calculator.register(charles)
    calculator.register(marie)

    println("total bonus: ${calculator.total}")
}