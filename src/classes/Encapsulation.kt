package classes

class Encapsulation {
    private var name: String = "Gökhan"
    private val surName: String = "ÖZTÜRK"

    fun getFullName(): String {
        return "$name $surName"
    }
}

fun main() {
    val encapsulation = Encapsulation()
//  encapsulation.name = "sadfdghh" // Hata verecek, çünkü 'name' değişkeni private
}
