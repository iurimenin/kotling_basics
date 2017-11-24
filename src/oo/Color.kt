package oo

/**
 * Created by Iuri Menin on 22/11/2017.
 */
enum class Color(val rgb: Int) {
    BLUE(0x0000FF),
    GREEN(0x00FF00),
    YELLOW(0xFFFF00),
    RED(0xFF0000);

    fun containsRed() : Boolean = this.rgb and 0xFF0000 != 0
}

fun main(args: Array<String>) {

}