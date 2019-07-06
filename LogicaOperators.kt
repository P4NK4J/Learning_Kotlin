

fun main(args: Array<String>) {
    /*
       Logical Operators

       AND = && -- Both have to be TRUE in order for us to get a True expression
       OR = ||  -- Only one side needs to be true, for the whole expression to be True
       NOT = !
     */


    var firstNum = 5
    var secondNum = 6
    var thirdNum = 10
    var isCorrect: Boolean = true


    if ((firstNum > secondNum) || !isCorrect) {
        //False                 OR     False
        println("Hello")
    }else {
        println("Nope")
    }

//    if ((firstNum < secondNum) && (thirdNum > firstNum)) {
//                //True        AND     True
//        println("Hello")
//    }else {
//        println("Nope")
//    }







}

