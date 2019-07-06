

fun main(args: Array<String>) {


    var myArray = Array<Int>(6){2}
    myArray[0] = 10
    myArray[1] = 1
    myArray[2] = 3
    myArray[3] = 8
    myArray[4] = 100
    myArray[5] = 1000


    //printing objects
    for (element in myArray) {
       //println("Items" + element)
    }

    //  printing items inside of the array via index

    for (index in 0..myArray.size - 1) {
        println(myArray[index])
    }



    //println(myArray[1])
}