package oo

/**
 * Created by Iuri Menin on 24/11/2017.
 */

// DRY = don't repeat yourself
class Stack<E>(vararg  val items: E) {

    val elements = items.toMutableList()

    fun push(element: E){
        elements.add(element)
    }

    fun pop(): E? {
        if (!isEmpty())
            return elements.removeAt(elements.size - 1)

        return null
    }

    fun isEmpty() : Boolean = elements.isEmpty()
}

fun <T> stackOf(vararg elements: T) : Stack<T> = Stack(*elements) // * = Spread Operator

fun main(args: Array<String>) {

    val stack = Stack(3, 5, 2, 8)
    stack.push(11)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())

    val stack2 = stackOf("hi", "hey", "hello")
    for (i in 1..3) {
        println(stack2.pop())
    }
}