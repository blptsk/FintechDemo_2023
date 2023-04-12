data class Person(var name: String, var age: Int, var city: String) {
    fun moveTo(newCity: String) { city = newCity }
    fun incrementAge() { age++ }
}

fun main() {
    val alicePerson = Person("Alice", 20, "Amsterdam")

    alicePerson.moveTo("London")
    alicePerson.incrementAge()
    alicePerson.moveTo("Sidney")
    alicePerson.incrementAge()

    alicePerson.apply {
        moveTo("London")
        incrementAge()
        moveTo("Sidney")
        incrementAge()
    }.also {
        it.moveTo("yu")
    }


    with (alicePerson) {
        moveTo("London")
        incrementAge()
        moveTo("Sidney")
        incrementAge()
    }

    Person("Alice", 20, "Amsterdam").apply {
        moveTo("London")
        incrementAge()
        moveTo("Sidney")
        incrementAge()
    }
}

