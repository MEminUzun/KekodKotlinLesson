package functions

fun main() {
    runAndPrint({ message ->
        println(message)  //burada run'i uazdiriyoruz
    }, { println(it) })  // Burada logger'i yazdiriyoruz.

    println("Start")
    val list = listOf(1, 2, 3, 4, 5, 6)
    list.forEach label@{
        if (it == 5) {
            return@label
        }
        println(it)

    }

    println("End")

}

inline fun runAndPrint(run: (String) -> Unit, noinline logger: (String) -> Unit) {
    log(logger)
    run("Message")
    logger("End")
}

fun log(logger: (String) -> Unit) {
    logger("Start")
}

// Burdan sonraki crossline kismi biraz corba oldu tekrar bakicam. Aslinda basit
// Ama biraz pratik lazims
