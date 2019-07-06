
fun main(args: Array<String>) {

    println(multiply(2, 3))

    var result = multiply(2, 3)

    var finalResult = result / divide(2)
    println("Result: $finalResult")

    println("My name is: ${getName("Paulo")}")


}

fun multiply(num1: Int, num2: Int) : Int {

    var result = num1*num2
    return result

}

fun divide(num1: Int): Int {
    return num1

}

fun getName(name: String): String{
    return name

}










