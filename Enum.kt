
//Enum Classes = allow us to represent collection of information
// ( fixed or static information)
enum class Suits{
    HEARTS,
    SPADES,
    DIAMONDS,
    CLUBS
}

enum class Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST
}

fun main(args: Array<String>) {



    var cardPlayer = Suits.DIAMONDS
    var cardPlayer2 = Suits.CLUBS

    if (cardPlayer == Suits.DIAMONDS) println("You are doing great!")
    if (cardPlayer2 == Suits.CLUBS) println("Hello there!  Things are not so well")

    var playerDirection = Directions.EAST
    if (playerDirection == Directions.EAST) {
        println("You are going Eastbound ")
    }



}