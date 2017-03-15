package collections

/**
 * Created by iurimenin on 13/03/17.
 */

fun main(args: Array<String>) {

    // Arrays
    val array = arrayOf("Texas", "Iowa", "California")
    val array2 = arrayOf("Orange", "Apple", "Bananas")
    val mixed = arrayOf("Kotlin", 17, 3.0, false)
    val numbers = intArrayOf(1,2,3,4,5)

    val states = arrayOf("Nevada", "Florida")
    val allStates = array + states

    println(allStates.size)

    val empty : Boolean = numbers.isEmpty()

    if (states.contains("Kentucky")) {
        println("It contains kentucky")
    } else {
        println("it does not")
    }

    // Lists
    val arrayList = arrayListOf("Patrick", "Michael", "Sarah")
    val list = arrayListOf("Peter")
    println(arrayList[0])
    println(arrayList + list)
    println(arrayList.isEmpty())
    println(arrayList.contains("Sarah"))

    arrayList.add("Josh")
    arrayList.add(1, "Jack")
    println(arrayList)

    val removed = arrayList.remove("Michael")
    println(arrayList)
    println(removed)

    val subList = arrayList.subList(1, 4)
    println(subList)

}
