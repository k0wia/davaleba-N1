fun main() {
    val kot: CarFactory = CarFactory()
    kot.name = "bmw"
    kot.color = "black"
    kot.withTurbo = true
    kot.year = 2018
    kot.maxSpeed = 257


    kot.printCarInfo()
    kot.coloring("white")
    kot.printCarInfo()

}




    class CarFactory {

        var name: String = ""
        var maxSpeed: Int = 0
        var year: Int = 0
        var withTurbo: Boolean = false
        var color: String = ""

        fun printCarInfo() {
            println("$name - $year - $color")
        }

        fun coloring(color: String) {
            if (color == this.color) {
                println("same color")
            } else {
                println("coloring...")
                this.color = color
            }


        }


    }








  


 