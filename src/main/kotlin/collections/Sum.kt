package collections

fun main() {
    val list1 = arrayListOf(1 ,2 ,1 ,3)
    val list2 = arrayListOf(4, 2, 1)

    println(list1.plus(list2))
    println(list1 + list2)
    println(list1.minus(list2))
    println(list1 - list2)
    println(list1 - listOf(1))

}
