package collections

/**
 * Created by Iuri Menin on 24/11/2017.
 */
fun main(args: Array<String>) {

    val namesToAges = mapOf(Pair("Iuri", 24), Pair("Joselito", 25))
    val namesToAges2 = mapOf(
            "Iuri" to 24,
            "Joselito" to 25
    )

    println(namesToAges == namesToAges2)

    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)

    val countryToInhabitants = mutableMapOf(
            "Germany" to 80_000_000,
            "USA" to 300_000_000
    )

    countryToInhabitants.put("Australia", 23_000_000)
    countryToInhabitants.putIfAbsent("USA", 320_000_000) //Só coloca se não tiver no map

    println(countryToInhabitants)

    println(countryToInhabitants.contains("Australia"))
    println(countryToInhabitants.containsKey("Australia"))
    println(countryToInhabitants.containsValue(20_000_000))

    println(countryToInhabitants["Germany"])
    println(countryToInhabitants.getOrDefault("France", 0))

    namesToAges.entries.forEach {
        println("${it.key} is ${it.value} years old.")
    }
}