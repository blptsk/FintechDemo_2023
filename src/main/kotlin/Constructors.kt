class Rectangle(var width: Double) {

    var height: Double

    init {
        this.height = width
        println("Первый блок инициализации")
    }

    constructor(width: Double, height: Double) : this(width) {
        this.height = height
    }

    init {
        println("Второй блок инициализации")
    }
}

fun main (){
    val rect = Rectangle(2.0)
}