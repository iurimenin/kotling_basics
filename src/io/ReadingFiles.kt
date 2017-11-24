package io

import java.io.File

/**
 * Created by Iuri Menin on 24/11/2017.
 */
fun main(args: Array<String>) {

    var lineNumber = 0
    File("src/inputfile.txt").forEachLine {
        ++lineNumber
        println("#$lineNumber: $it")
    }
}