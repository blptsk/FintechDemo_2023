package lambdas.lambdas

fun main () {
    var startedValue = 2.0

    calculator(
        { a:Double,b:Double ->
            startedValue++
            a + b
        },
        2.0,
        3.0)

    println(startedValue)
}