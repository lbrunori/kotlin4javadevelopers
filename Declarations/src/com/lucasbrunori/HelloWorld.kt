package com.lucasbrunori

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {

    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John",  2)
    val employeeThree = Employee("John",2)
    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree)
    println(employeeOne.equals(employeeTwo))
    println(employeeTwo.equals(employeeThree))

    val employeeFour = employeeTwo

    println(employeeFour === employeeTwo)

    println(employeeFour != employeeTwo)
    println(employeeFour !== employeeTwo)

    println(employeeFour != employeeThree)
    println(employeeFour !== employeeThree)

    val x = 0b0010
    val y = 0b0011

    println(x)
    println(y)
    println(x or y)
    println(x and y)
    println(x xor y)

    val something: Any = employeeFour
    if(something is Employee){
      //val newEmployee = something //actually not needed as Employee
        println(something.name)
    }

    var number: Int
    number = 10
    number = 25
    println(number)

    val names = arrayListOf("John", "Jane", "Mary")
    println(names[1])

     var employee1 = Employee("Lynn Jones", 500);
    employee1.name = "Lynn Smith"

    println(employee1)

    val employee2: Employee
    val number2 = 10

    val change = 4.22
    println("Your change is $change")
    println("Your change is $$change")

    if(number < number2){
        employee2 = Employee("Jane Smith", 1000)
    }else{
        employee2 = Employee("Mike Watson", 150)
    }

    val employees : EmployeeSet

    println(employee2)

    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    println("The employee's id is ${employee1.id}")

    val eggName = "Humpty"
    val nurseryRhyme = """$eggName Dumpty sat on the wall
                        |$eggName Dumpy had a great fall
                        |All the king's horses and all the king's men
                        |Couldn't put $eggName together again.
    """.trimMargin()

    println(nurseryRhyme)
}

class Employee(var name: String, val id: Int){

    override fun equals(employee: Any?): Boolean {
        if(employee is Employee){
            return name == employee.name && id == employee.id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}