package day1.exam6

class Person(
    private val name: String,
    private val age: Int
) {

    fun greet() {
        println("Hello, my name is $name, my age is $age")
    }
}

fun main() {
    val person = Person("Alice", 30)
    person.greet()
}