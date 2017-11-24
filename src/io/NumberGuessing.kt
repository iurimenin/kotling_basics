package io

import java.util.*

/**
 * Created by Iuri Menin on 24/11/2017.
 */
fun main(args: Array<String>) {

    val number = Random().nextInt(100) + 1
    var input: String?
    var guess = -1

    while (guess != number) {
        print("Guess a number betwenn 1 and 100: ")
        input = readLine()

        if (input != null) {
            // can throw numberFormatEx
            guess = input.toInt()
        }

        if (guess < number)
            println("Too low")
        else if (guess > number)
            println("Too large")
        else
            println("You won!")
    }
}