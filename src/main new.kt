fun main(){
    var f1 = Fraction(3F, 4F)

    var f2 = Fraction(6F, 8F)
    println(f1 == f2)
    println(f1)

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



}