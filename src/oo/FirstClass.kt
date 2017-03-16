package oo

import java.util.*

/**
 * Created by iurimenin on 16/03/17.
 */

class Person(val name: String, var age: Int) {
// class Person(name: String, age: Int) {
//    val name: String
//    var age: Int
//
//    init {
//        this.name = name
//        this.age = age
//        println("Object was created")
//    }
//    assim é BATATA

    fun speak() {
        println("Hello bitch!")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

//    fun getYearOfBirth() : Int {
//        return 2016 - age;
//    }

    fun getYearOfBirth() = Calendar.getInstance().get(Calendar.YEAR) - age
}

fun main(args: Array<String>) {
    val person = Person("Iuri", 24)

    person.speak()
    person.greet("batata")
    println(person.getYearOfBirth())
    println(person.name)
    println(person.age)

}