package day1.exam17

fun main() {
    val day = 2

    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        else -> "Invalid Day"
    }

    println("Day: $dayName")
}