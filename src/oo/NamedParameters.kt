package oo

import javax.swing.tree.FixedHeightLayoutCache

/**
 * Created by iurimenin on 16/03/17.
 */

class House(val height: Double, val color: String, val price: Int = 50000) {

    fun print(){
        println("House [height$height, color=$color, price=$price]")
    }
}

fun main(args: Array<String>) {
    val house = House(height = 4.5, color = "Blue", price = 150000)
    val redHouse = House(color = "Blue", price = 150000, height = 5.0)
    val yeallowHouse = House(color = "Yellow", height = 2.5)

    house.print()
    redHouse.print()
    yeallowHouse.print()
}