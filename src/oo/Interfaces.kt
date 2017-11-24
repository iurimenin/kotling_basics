package oo

/**
 * Created by iurimenin on 18/03/17.
 */

interface Driveable {

    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(val color: Color) : Driveable, Buildable {

    override val timeRequired = 120

    override fun build() {
        println("Built a shiny car.")
    }

    override fun drive() {
        println("Driving car.")
    }
}

class MotorCycle(val color:Color) : Driveable {
    override fun drive() {
        println("Driving motorcycle.")
    }
}

fun main(args: Array<String>) {
    val car: Driveable = Car(Color.BLUE)
    car.drive()
    //car.build()// vai dar erro pois a variavel é do tipo Driveable

}