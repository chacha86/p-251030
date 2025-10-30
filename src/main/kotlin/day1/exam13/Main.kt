package day1.exam13

fun sayHello(name: String = "Guest", age: Int = 20) {
    println("Hello, $name, $age")
}

fun main() {
    sayHello() // 기본값 사용
    sayHello("Alice")
    sayHello(age = 25)
    sayHello("Bob", 30)
}