package day1.exam7

fun main() {
//    val names = listOf("Alice", "Bob", "Charlie")
    val names = mutableListOf("Alice", "Bob", "Charlie")

    names.add("Daniel")

    for (name in names) {
        println(name)
    }

}