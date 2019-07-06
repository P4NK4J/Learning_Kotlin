

open class Animal() {

    // public == default
    // private == will not be visible outside this class
    //protected = same as private + visible in subclasses

    var name: String? = null
    var color: String? = null
    protected var numLegs: Int? = null

    constructor(name: String, color: String, numLegs: Int): this() {
        this.name = name
        this.color = color
        this.numLegs = numLegs

        println("Object: " + this.name)
        println("Object: " + this.color)
        println("Object: " + this.numLegs)


    }
    constructor(name: String, color: String): this() {
        this.name = name
        this.color = color

       // println("Third constructor: " + this.name)


    }

    fun setNumLegs(num: Int) {
        this.numLegs = num
    }

    open fun makeNoise() {
        println("Making noise...")
    }
    fun showAnimal() {
        println("Name is:" + this.name)
        println("Color is:" + this.color)
        println("Num legs:" + this.numLegs)

    }


}

class Cat: Animal {

    constructor(): super() {

    }



    override fun makeNoise() {
        println("Meowww!")
        super.color

    }

}
class Lion: Animal {
    var numEyes: Int? = null
    var age: Int? = null

    constructor(numEyes: Int, age: Int, name: String): super() {
        super.name = name
        this.numEyes = numEyes
        this.age = age

       // println("Lion Constructor: " + this.numEyes + " " + this.age )


    }

    override fun makeNoise() {
        println("Roarrrr!")
    }



}



fun main(args: Array<String>) {

    var newAnimal = Animal("Animal", "Brown")
    newAnimal.setNumLegs(4)


    newAnimal.showAnimal()












//    var lion = Lion(2, 21, "Lion")
//    var cat = Cat()
//
//    cat.makeNoise()
//    lion.makeNoise()
















//    //var animal = Animal("Animal", "Brown")
//    var animal = Animal()
//    animal.color = "Brown"
//    animal.name = "Lion"
//    animal.numLegs = 4
//
//    var animal2 = Animal("Another animal", "Blue", 6)
//
//   // animal.showAnimal()
//    animal2.showAnimal()


















//    var lion = Lion(2, 21, "lion")
//
//
//
//    lion.showName()



    //println("Lion Age " + lion.age)

    //var animal = Animal("Dog", "Brown", 4)
   // var lion = Lion()
   // lion.numLegs = 4

    //println("Num legs" + lion.numLegs)





}