package collections

val listOfInt = listOf(1,4,6,1,3,6,23,5,238)
val listOfNullableInt: List<String> = listOf("12", "21s", "23d")

fun main() {


    listOfInt.forEachIndexed { index, i ->
        println("[$index] $i")
    }


    println(listOfInt.mapIndexed { index, i ->
        i + index
    })
    println(listOfNullableInt)
    println(
        listOfNullableInt.mapNotNull {
            it.toIntOrNull()
        }
    )

    listOfInt.map {
        it * 2
    }
}