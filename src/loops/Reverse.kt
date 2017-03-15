package loops

/**
 * Created by iurimenin on 14/03/17.
 */

fun main(args: Array<String>) {
    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    println(reverse(numbers))
    println(reverse2(numbers))
}

//normal
fun reverse (list: List<Int>) : List<Int> {

    val result = arrayListOf<Int>()

    for (i in 0..list.size - 1) {
        result.add(list.get(list.size - 1 -i))
    }

    return result
}

//kotlin
fun reverse2 (list: List<Int>) : List<Int> {

    val result = arrayListOf<Int>()

    for (i in list.size - 1 downTo  0) {
        result.add(list.get(i))
    }

    return result
}