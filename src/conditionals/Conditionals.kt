package conditionals

/**
 * Created by iurimenin on 13/03/17.
 */
fun main(args: Array<String>) {

//    var age : Int = 19
//
//    if (age < 18)
//        println("You cannot register.")
//    else if (age < 21)
//        println("Well, maybe you can register")
//    else if (age < 27)
//        println("You should be able to register")
//    else
//        println("You're good to go!")
//
//    println("Aeo")

//    val mode: Int = 2
//
//    var result = when(mode) {
//
//        1 -> "The mode is lazy"
//        2 -> {
//            //Sempre retorna a ultima expressão
//            "The mode is 2"
//            var i: Int = 3
//            "So the mode is busy"
//        }
//        3 -> "The mode is super-productive"
//
//        else -> "I don't know that mode"
//    }
//
//    println(result)
//
//    val x= if (mode < 2) {
//        println("Mode is less then 2")
//        17
//    } else {
//        42
//    }
//
//    println(x)

    val x = 10

    when(x) {
        5 -> println("x is 5")
        3*12 -> println("x is 3*12")
        "Hey there".length -> println("x is the length of the string 'Hey there'")
        in 1..10 -> println("x is between 1 and 10")
        in 11..20 -> println()
        in 21..30 -> println()
        !in(1..9) -> println("x is not between 1 to 9")
    }
}