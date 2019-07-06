
class House(type: String, price: Double, yearBuilt: Int, owner: String ) {

    var type: String? = null
    var price: Double? = null
    var yearBuilt: Int? = null
    var owner: String? = null

    init { // initializes all or our properties
         this.type = type
         this.price = price
         this.yearBuilt = yearBuilt
         this.owner = owner
        println("Type: $type")

    }

    fun GetType(): String? {
        return this.type
    }
    fun SetType(type: String) {
        this.type = type
    }





}


fun main(args: Array<String>) {

    var myHouse = House("3 Bedroomhouse", 23000.0, 1978, "Paulo")
    myHouse.SetType("8 Bedroomhouse")
    var secondHouse = House("6 Bedrooms", 123000.00, 2016, "Bonni")


    println(myHouse.GetType())

   // myHouse.owner = "Arthur"

   // println(myHouse.owner)
   // println("Price: " +secondHouse.price)




}
