package com.lucasbrunori

fun main(args: Array<String>) {

    val hello1 = "Hello"
    val hello2 = "Hello"

    print("Are hello1 and hello2 referentially equal? ${hello1 === hello2}")

    println("Are hello1 and hello2 structurally equal? ${hello1 == hello2}")

    var integerValue = 2988

    val text: Any = "The Any type is the root of the Kotlin class hierarchy"

    if(text is String){
        println(text.toUpperCase())
    }

    println("""
        |   1
        |  11
        | 111
        |1111""".trimMargin())

    println("""
        1   1
        1  11
        1 111
        11111""".trimMargin("1"))
}