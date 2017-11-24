package oo

/**
 * Created by iurimenin on 18/03/17.
 */
class Book(val title:String, val author: String, val publicationYear : Int, var price: Double) {

    override fun toString(): String =
            "Book[title=$title, author=$author, publicationYear=$publicationYear, price=$price]"
}

data class DataBook(val title:String, val author: String, val publicationYear : Int, var price: Double)

fun main(args: Array<String>) {

    val book = Book("Super Book", "Juca Bala", 2017, 99.99)
    val book2 = Book("Super Book", "Juca Bala", 2017, 99.99)
    val dataBook = DataBook("Super Book", "Juca Bala", 2017, 99.99)
    val dataBook2 = DataBook("Super Book", "Juca Bala", 2017, 99.99)
    val dataBook3 = dataBook.copy(price= 89.99)

    val (title, author, year, price) = dataBook
    val set = hashSetOf(dataBook, dataBook2, dataBook3)
    val set2 = hashSetOf(book, book2)

    println(set)
    println(set2)

    print(title)
    print(author)

    println(book)
    println(dataBook)
    println(dataBook3)

    println(book == book2)
    println(dataBook == dataBook2)
}