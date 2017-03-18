package oo

import java.util.*

/**
 * Created by iurimenin on 17/03/17.
 */

//open class Pessoa (open val name: String, open var age: Int) { //Dessa forma voce consegue instanciar a classe pessoa
abstract class Pessoa (open val name: String, open var age: Int) { //Dessa forma a classe é abtrada e nao pode ser instanciada

    abstract fun speak()

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = Calendar.getInstance().get(Calendar.YEAR) - age
}

class Estudante (override val name: String, override var age: Int, val studentID: Long): Pessoa(name, age) {
    override fun speak() {
       println("Hello, I'm a student")
    }

    fun isIntellinget() = true
}

class Empregado (override val name: String, override var age: Int): Pessoa(name, age) {

    override fun speak() {
        println("Hello, I'm an employee")
    }

    fun receivePayment(){
        println("Received payment")
    }
}

fun main(args: Array<String>) {
    val estudante = Estudante("Herp", 22, 12314213)
    estudante.isIntellinget()

    val empregado = Empregado("Derp", 32)
    empregado.receivePayment()
}