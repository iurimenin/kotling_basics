package functions

import java.util.*

/**
 * Created by iurimenin on 14/03/17.
 */
fun main(args: Array<String>) {
    helloWorld()
    printWithSpaces("Iuri")
    println(getCurrentDate())
    println(max(17, 42))
}

fun helloWorld() {
    println("Hello World!")
}

fun printWithSpaces(text: String) {

    for (c in text) {
        print(c + " ")
    }
    println()
}

fun getCurrentDate(): Date {
    return Date();
}

fun max(a: Int, b: Int) : Int {

    if (a >= b)
        return a
    else
        return b
}