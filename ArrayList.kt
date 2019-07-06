


fun main(args: Array<String>) {
    //(1 -> Mary)
    //(Mary -> Married)

    //ArrayLists

    var myArrayList = ArrayList<String>()
    myArrayList.add("James")
    myArrayList.add("Paul")
    myArrayList.add("Bonni")
    myArrayList.set(1, "Salmon")


    if (myArrayList.contains("Bonni")) println("She's beautiful")
    myArrayList.remove("James")

    //iterating through objects
    for (names in myArrayList) {
        println("Names:" + names)
    }

    for (index in 0..myArrayList.size - 1) {
       // println("Items: " + myArrayList.get(index))
    }


   // println(" " + myArrayList.get(1))


}