package loops

/**
 * Created by iurimenin on 14/03/17.
 */

fun main(args: Array<String>) {

    //for
    var sum = 0
    for (i in 1..100) {
        sum += i
    }
    println(sum)

    val list = listOf("Java", "Kotlin", "Python")
    for (element in list){
        println(element)
    }

    for((index, value) in list.withIndex()) {

        println("Element at $index is $value")
    }


    //while
    var x = 9

    while (x >= 0) {
        println(x)
        x --
    }

    var i = 0

    while (i <= 10) {
        println(i)
        i++
    }

    //break and continue
    for (c in "Python") {
        if (c == 'o')
            break;
        println(c)
    }

    val listLoop = listOf("Book", "Table", "Laptop")
    for (str in listLoop) {
        if (!str.contains('o')) {
            continue;
        }
        println(str)
    }


    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5)
                break@outer
            println("$i - $j")
        }
    }

}