package oo

/**
 * Created by Iuri Menin on 24/11/2017.
 */
class Animal {

    var age: Int = 0
//        get() = field
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}

fun main(args: Array<String>) {
    val animal = Animal()
    animal.age = 8
    animal.age = -2
    println(animal.age)
}