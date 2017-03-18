package oo

/**
 * Created by iurimenin on 18/03/17.
 */
abstract class Course(val topic: String, val price: Double) {
    open fun learn() {
        println("Learning a $topic course")
    }
}

interface Learnable {

    fun learn () {
        println("Learning")
    }
}

open class KotlinCourse() : Course ("Kotlin", 25.00), Learnable{

    //override fun learn() { // desse jeito a classe fica de KotlinCourse pode dar  override na funcao learn
    override final fun learn() { // desse jeito não
        super<Course>.learn() //Mesmo tendo 2 meotodos com o mesmo nome eu consigo chamar
                              // o super dizendo de qual classe pai deve chamar
       println("I'm one of the first people to learn kotlin")
    }
}

class SpecialKotlinCourse() : KotlinCourse(){

}

fun main(args: Array<String>) {
    val course = KotlinCourse()
    course.learn()
}