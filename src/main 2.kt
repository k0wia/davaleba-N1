fun main(){
    var r = Rectangle(3F, 4F)
    println(r.getArea())
    println(r)


}
interface IFigure {
    fun getArea(): Float
    fun getPerimeter(): Float
}
class Rectangle(private val width: Float, private val height: Float): IFigure {
    override fun getArea(): Float {
        return width * height

    }

    override fun getPerimeter(): Float {
        return 2 * (width+ height)
    }

    override fun toString(): String {
        return "$width; $height"

    }
}
