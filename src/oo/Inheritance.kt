package oo

import java.util.*

/**
 * Created by iurimenin on 17/03/17.
 */

open class Pessoa (open val name: String, open var age: Int) {

    fun speak() {
        println("Hello bitch!")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = Calendar.getInstance().get(Calendar.YEAR) - age
}

class Estudante (override val name: String, override var age: Int, val studentID: Long): Pessoa(name, age) {

    fun isIntellinget() = true
}

class Empregado (override val name: String, override var age: Int): Pessoa(name, age) {

    fun receivePayment(){
        println("Received payment")
    }
}

fun main(args: Array<String>) {
    val estudante = Estudante("Iuri", 24, 12314213)
    estudante.isIntellinget()

    val empregado = Empregado("Mary", 32)
    empregado.receivePayment()
}