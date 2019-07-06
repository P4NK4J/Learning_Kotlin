// Abstract Classes = not meant to be instantiated and they also
// can have a mixture of functions declared with or without an implementation

abstract class GraphicObject {

    fun moveTo(newX: Int, newY: Int) {
        println("Moved to new x and new y")
    }

    abstract fun draw()
    abstract fun resize()

}

class Circle: GraphicObject() {
    override fun draw() {
       println("Drawing circle")
    }

    override fun resize() {
        println("Resizing Circle")
    }

}

class Triangle: GraphicObject() {
    override fun draw() {
       println("Drawing Triangle")
    }

    override fun resize() {
        println("Resizing Triangle")
    }

}

fun main(args: Array<String>) {

    var circle = Circle()
    circle.draw()
    circle.moveTo(12, 23)

    //Create a Triangle
    var triangle = Triangle()
    triangle.draw()





}