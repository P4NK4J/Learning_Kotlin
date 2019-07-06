


fun main(args: Array<String>) {

    //Default is always immutable
    var myArrayList = listOf<String>("Me", "James", "Bonni", "Life")
   // println(myArrayList[0])


    //Make it mutable
    var mutableList = mutableListOf<String>("Me", "They", "James")
    mutableList[0] = "Paul"


    //HashMap
    var myHashmap = hashMapOf(1 to "Paulo", 2 to "James")
    println(myHashmap.get(1))


    //Array
    var myArray = arrayOf(1, 4, 8, 10)
    myArray[0] = 3


    for (items in myArray) {
        println("Items $items")
    }




    //for (items in mutableList) println("Items $items")




}
