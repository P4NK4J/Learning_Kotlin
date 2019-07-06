

class Home() {
    //type: String, price: Double, yearBuilt: Int, owner: String

    var type: String? = null
    var price: Double? = null
    var yearBuilt: Int? = null
    var owner: String? = null

    constructor(type: String, price: Double, yearBuilt: Int, owner: String): this() {

        this.type = type
        this.price = price
        this.yearBuilt = yearBuilt
        this.owner = owner

        println("Type: $type")
        println("Price: $price")
        println("yeaBuilt: $yearBuilt")
        println("Owner: $owner")



    }
    constructor(type: String): this() {
        this.type = type

        println("Type: $type")
    }



//    init { // initializes all or our properties
//        this.type = type
//        this.price = price
//        this.yearBuilt = yearBuilt
//        this.owner = owner
//        println("Type: $type")
//
//    }






}


fun main(args: Array<String>) {


    var myHome = Home()
    var newHome = Home("10 Bedrooms", 1234509.90, 1987, "James")
    var nextHome = Home("Mansion")

    myHome.owner = "Paulo"
    myHome.price = 12345.9
    myHome.yearBuilt = 1987







}







