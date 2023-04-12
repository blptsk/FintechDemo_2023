package data_classes

data class KotlinDataClassPerson(val name: String, val surName: String, val id: String)

fun main(){
    println(KotlinDataClassPerson("123","name", "surname"))
}
