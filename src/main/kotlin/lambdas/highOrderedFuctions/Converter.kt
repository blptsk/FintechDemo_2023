package lambdas.highOrderedFuctions

fun convert(x: Double, converter: (Double) -> Double) : Double {
    val result = converter(x)
    println("$x is converted to $result") // выводим результат
    return result // вернуть результат
}

fun main() {
    println( convert(20.0) { c: Double -> c * 1.8 + 32 })

    val pounds = getConversionLambda("KgsToPounds")(2.5)

    println(pounds)

    println( convert(2.5, getConversionLambda("KgsToPounds")))

}

fun getConversionLambda(str: String): (Double) -> Double {
    if (str == "CentigradeToFahrenheit") {
        return { it * 1.8 + 32 }
    } else if (str == "KgsToPounds") {
        return { it * 2.204623 }
    } else if (str == "PoundsToUSTons") {
        return { it / 2000.0 }
    } else {
        return { it }
    }
}
