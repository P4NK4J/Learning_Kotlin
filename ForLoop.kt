
fun main(args: Array<String>) {


    //For loop

    for (item in 0..100) {
         if (item % 2 == 0 ) { // if the number is divisible by 2, or multiple of 2
             println("Fizz $item")
         }else if ( item % 3 == 0) {
              println("Buzz $item")
         }

    }

}