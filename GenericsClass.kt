

class Login<T> (name: T, password: T) {
    init {
        println("Name: " + name + " password: " + password)
    }
}

class Person(username: String, password: String) {
    var username: String? = null
    var password: String? = null
    init {
        this.username = username
        this.password = password
        println("Person class")
    }
}




fun main(args: Array<String>) {

    var myArray = Array<Int>(5){0}

    print("Array" + myArray)

    var login = Login<String>("John", "John")
    var login2 = Login<Int>(12, 34)
    var login3 = Login<Boolean>(true, false)

    var person = Person("Paulo", "paul")

    var user = Login<Person>(person, person)



}
