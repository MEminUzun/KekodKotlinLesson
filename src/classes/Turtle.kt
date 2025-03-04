package classes

class Turtle constructor(mAge: Int = 28,mName: String = "Dilaver") {
    val feetCount: Int = 4
    val feetColor: String = "Brown"
    val headCount: Int = 1
    val headColor: String = "Brown"
    var age: Int = 28
    val shelterColor: String = "Green"
    val tailCount: Int = 1
    val tailColor: String = "Brown"
    var name: String = "Dilaver"
    val sex: String = "Female"
    var isMarried: Boolean = true

    init {
        age = mAge
        name = mName
        println("Primary Constructor created!!!")

    }

    constructor(mAge: Int = 28,mName: String = "Dilaver",isMarried: Boolean = true) : this(mAge,mName){
        println("Secondary Constructor created!!!")

    }


    fun makeASound(): String {
        return "Auuuuu"
    }

    fun eatMeal(): String {
        return "Limonlu laviva "
    }

    fun walk() {
        println("Catwalk atiyorummm slayyy!!!")
    }

    fun swim() {

    }
}

    fun main() {
        val turtleOne: Turtle = Turtle()  // Bu paranteze Constructor denir.
        val turtleTwo: Turtle = Turtle(mAge = 10)
        val turtleThree: Turtle = Turtle(35,"Dilo")
        val turtleFour: Turtle = Turtle(22,"dilos",false)
        println(turtleOne.age)
        println(turtleOne.eatMeal())

        turtleOne.walk()
    }


