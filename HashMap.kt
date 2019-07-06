


fun main(args: Array<String>) {
    /*
       Hashmap = Key-value pairs

     */
    //(1 -> Mary)
    //(Mary -> Married)

    var hashmap = HashMap<String, String>()
    hashmap.put("Mary", "Married")
    hashmap.put("Paulo", "Married")
    hashmap.put("John", "Single")


    for (k in hashmap.keys) println(hashmap.get(k))



   // println(hashmap.get("John"))




}
