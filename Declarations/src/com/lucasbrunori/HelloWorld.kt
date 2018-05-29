package com.lucasbrunori

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>) {
    var number: Int
    number = 10
    number = 25
    println(number)

    val names = arrayListOf("John", "Jane", "Mary")
    println(names[1])

     var employee1 = Employee("Lynn Jones", 500);
    employee1.name = "Lynn Smith"

    val employee2: Employee
    val number2 = 10



    if(number < number2){
        employee2 = Employee("Jane Smith", 1000)
    }else{
        employee2 = Employee("Mike Watson", 150)
    }

    val employees : EmployeeSet

    println(employee2)
}

class Employee(var name: String, val id: Int){
    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}