fun main() {
    val c1 = Point(2, 7 )
    val c2 = Point(2, 7)


    println(c1)
    println(c1 == c2)
    c1.simetriuliGadatana()

}
class Point(x: Int, y: Int) {
    var x: Int = x
    var y: Int = y

    override fun toString(): String {
        return "$x; $y"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if ((x == other.x) and (y == other.y)) {
                return true
            }
        }
        return false
    }
    fun simetriuliGadatana(){
        x = -x
        println("simetriuli gadatanis shemdeg koordinatebi iqneba $x,$y")
    }

}
