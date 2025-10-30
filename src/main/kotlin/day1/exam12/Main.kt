package day1.exam12

fun String.aaaa() {
    println("hello, $this ~!")
}

fun main() {
    val name: String = "Alice"
    name.aaaa() // hello, Alice ~!
}