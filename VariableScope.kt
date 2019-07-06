

//var myName = "Elliot" // global variable
var myName: String? = null

fun main(args: Array<String>) {
    //var myName --> local variable which is only visible inside of this function
   myName

    showName("James")
}

fun showName(name: String) {
    myName

    println("Name: $myName")
}