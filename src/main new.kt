import kotlin.math.min
import kotlin.math.roundToInt

fun main(){
    var f1 = Fraction(3F, 4F)

    var f2 = Fraction(6F, 8F)
    println(f1 == f2)
    println(f1)
    println(f2)
    f2.shekveca()
    println(f2)

    println(f1.gamravleba(f2))
    println(f1.mimateba(f2))





}
fun usg(a : Float, b: Float): Float {

    var c = min(a,b)
    var usg1: Float = 0F

    for(i in c.toInt() downTo 1){

        if(a.toInt()%i==0 && b.toInt()%i==0){
            usg1=i.toFloat()
            break
        }
    }
    return usg1

}

class Fraction(n: Float, d: Float) {
    private var numerator: Float = n
    private var denominator: Float = d

    override fun equals(other: Any?): Boolean {
        if (other is Fraction){
            if(numerator * other.denominator / denominator == other.numerator){
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    fun shekveca(){
        var d:Float = usg(numerator,denominator)
        numerator = numerator/d
        denominator = denominator/d
    }

    fun gamravleba(other:Fraction):Fraction{
        var newMricxveli: Float = numerator*other.numerator
        var newMnishvneli: Float = denominator*other.denominator
        var newWiladi:Fraction = Fraction(newMricxveli, newMnishvneli)
        return newWiladi
    }

    fun mimateba(other : Fraction):Fraction{
        var usj:Float= (denominator*other.denominator)/usg(denominator, other.denominator)

        var newMricxveli: Float = ((numerator*(usj/denominator))+(other.numerator*(usj/other.denominator)))
        var newWiladi: Fraction = Fraction(newMricxveli,usj)
        return newWiladi
    }


}





