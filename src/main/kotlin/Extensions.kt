
class MyFinalClass(private val name: String, val surName: String) {
    //some code
}

fun MyFinalClass.printNameAndSurname() {
    println("Фамилия $surName")
    // println("Имя и фамилия - $name $surName") - не будет работать, т.к. name - приватное поле
}
fun Int.square(): Int{
    return this * this
}

fun main() {
    MyFinalClass("Van", "Darkholm").printNameAndSurname()
    println(23.square())
}


