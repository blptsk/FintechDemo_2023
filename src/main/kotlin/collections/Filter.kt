package collections

val listOfInt2 = listOf(1,4,6,1,3,6,23,5,238)

fun main() {
    println(listOfInt2)
    println(
        listOfInt2.any {
            it == 23
        }
    )
}