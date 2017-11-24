package io

import java.io.File

/**
 * Created by Iuri Menin on 24/11/2017.
 */
fun main(args: Array<String>) {

    val ipToCount = mutableMapOf<String, Int>()
    File("src/ips.txt").forEachLine {

// ###################################################### Normal #####################################################
//        if (ipToCount.contains(it)) {
//            val previous = ipToCount[it]!!
//            ipToCount.put(it, previous + 1)
//        } else {
//            ipToCount.put(it, 1)
//        }

// ###################################################### Kotlin #####################################################
        val previous = ipToCount.getOrDefault(it, 0)
        ipToCount.put(it, previous + 1)
    }


// ###################################################### Normal #####################################################
//    var maxIp = ipToCount.keys.first()
//    var maxCount = 0
//
//    for ((ip, count) in ipToCount.entries) {
//
//        if (count > maxCount) {
//            maxIp = ip
//            maxCount = count
//        }
//    }

// ###################################################### Kotlin #####################################################
    val (maxIp, maxCount) = ipToCount.entries.maxBy { it.value }!!

    println("Most frequent IP addres is $maxIp, which occurred $maxCount times.")
}