package oo

/**
 * Created by iurimenin on 18/03/17.
 */

interface Driveable {

    fun drive();
}

interface Buildable {
    val timeRequired: Int
    fun build()
}
class Car(val color:String) : Driveable, Buildable {

    override val timeRequired = 120

    override fun build() {
        println("Built a shiny car.")
    }

    override fun drive() {
        println("Driving car.")
    }
}

class MotorCycle(val color:String) : Driveable {
    override fun drive() {
        println("Driving motorcycle.")
    }
}

fun main(args: Array<String>) {
    val car: Driveable = Car("blue")
    car.drive()
    //car.build()// vai dar erro pois a variavel é do tipo Driveable

}