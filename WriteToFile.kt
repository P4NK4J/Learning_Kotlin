

import java.io.FileReader
import java.io.FileWriter


fun main(args: Array<String>) {


    readFile()
//    println("Enter a message")
//    var message = readLine().toString()
//
//
//    if (message.equals("")) {
//        println("Please enter a message")
//    }else {
//        writeToFile(message)
//
//    }



}

fun readFile() {
    var reader = FileReader("message.txt")
    var readMessage: String? = null
    var char: Int?

    try {
        do {
            char = reader.read()
          print(char.toChar())



        }while (char != -1)


    }catch (ex: Exception) {
        print(ex.message)
    }
}












//fun readFromFile() {
//    val stream = Files.newInputStream(Paths.get("message.txt"))
//    stream.buffered().reader().use {
//        reader -> println(reader.readText())
//    }
//}



fun writeToFile(message: String) {

    try {

        var writer = FileWriter("message.txt", true)
        writer.write(message + "\n")
        writer.close()


    }catch (ex: Exception){
        println("Exception $ex")
    }



}
