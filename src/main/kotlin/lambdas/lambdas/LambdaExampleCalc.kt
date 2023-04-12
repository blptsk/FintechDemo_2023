package lambdas.lambdas

val sum = { a: Double, b: Double -> a + b }
val subtraction = { a: Double, b: Double ->
    if (a == 0.0)
        println("a == 0")
    else
        println("a != 0")
        a - b
}

fun main() {
    calculator(sum, 2.0, 3.0)
    calculator(subtraction, 8.0, 3.0)
    calculator(sum, 12.0, 34.0)

}

fun calculator(lambda : ((Double, Double)-> Double), a: Double, b: Double ) {
    println(lambda(a,b))
}