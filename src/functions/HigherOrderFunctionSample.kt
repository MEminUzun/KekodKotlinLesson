package functions

fun main() {
//    calculateAndPrint(10, 20, { numberOne, numberTwo -> numberOne * numberTwo }) // Result: 200
//    calculateAndPrint(10, 20, { numberOne, numberTwo -> numberOne + numberTwo }) // Result: 30
//    calculateAndPrint(10, 2, { numberOne, numberTwo -> numberOne / numberTwo }) // Result: 5
//    calculateAndPrint(10, 20, { numberOne, numberTwo -> numberOne - numberTwo }) // Result: -10
//    calculateAndPrint(3, 2, { numberOne, numberTwo -> numberOne % numberTwo }) // Result: 1

    val numberOne = readln().toInt()
    val numberTwo = readln().toInt()
    val operation: String = readln()

    val sumFunction = { numberOne: Int, numberTwo: Int ->
        numberOne + numberTwo
    }
    val minusFunction = fun(numberOne: Int, numberTwo: Int): Int {
        return numberOne - numberTwo
    }

//    calculateAndPrint11(1,2,{
//        it
//    })


    when (operation) {
        "+" -> calculateAndPrint(numberOne, numberTwo, { numberOne: Int, numberTwo: Int -> numberOne + numberTwo })
        "+" -> calculateAndPrint(numberOne, numberTwo, sumFunction
        ) // usteki kodla ayni ciktiyi verir farkli yazim turudur.

        //"-" -> calculateAndPrint(numberOne, numberTwo, { numberOne: Int, numberTwo: Int -> numberOne - numberTwo })
        "-" -> calculateAndPrint(numberOne, numberTwo, minusFunction) // usteki ile ayni degiskene atadik fonksiyonu.

        "x" -> calculateAndPrint(numberOne, numberTwo, { numberOne: Int, numberTwo: Int -> numberOne * numberTwo })

        //"/" -> calculateAndPrint(numberOne, numberTwo, { numberOne: Int, numberTwo: Int -> numberOne / numberTwo })
        //"/" -> calculateAndPrint(numberOne, numberTwo, ::divFunction)  // ustekinin aynisi :: kullanimi onemli
        //"/" -> calculateAndPrint11(numberOne,numberTwo,::divFunction11)

    }

}

fun divFunction(numberOne: Int, numberTwo: Int): Int {
    return numberOne / numberTwo


//    calculateAndPrint(10, 20, { numberOne, numberTwo -> numberOne * numberTwo }) // Result: 200
//    calculateAndPrint(numberOne, numberTwo,sumFuction) // Result: 30
//    calculateAndPrint(10, 2, { numberOne, numberTwo -> numberOne / numberTwo }) // Result: 5
//    calculateAndPrint(10, 20, { numberOne, numberTwo -> numberOne - numberTwo }) // Result: -10
//    calculateAndPrint(3, 2, { numberOne, numberTwo -> numberOne % numberTwo }) // Result: 1


//    calculateAndPrintNormal(10,20,'*') //200
//    calculateAndPrintNormal(10,20,'+') //30
//    calculateAndPrintNormal(10,2,'/')  //5
//    calculateAndPrintNormal(10,20,'-') //-10
//    calculateAndPrintNormal(3,2,'%')   //1

}
fun divFunction11(numberOne: Int): Int {
    return numberOne
}


//fun calculateAndPrintNormal(numberOne: Int, numberTwo: Int, operation: Char) {
//    var result = when (operation) {
//        '+' -> {
//            numberOne + numberTwo
//        }
//
//        '-' -> {
//            numberOne - numberTwo
//        }
//
//        '*' -> {
//            numberOne * numberTwo
//        }
//
//        '/' -> {
//            numberOne / numberTwo
//        }
//
//        '%' -> {
//            numberOne % numberTwo
//        }
//
//        else -> {
//            println("Gecerli bir islem giriniz")
//        }
//    }
//    println(result)

//}



fun calculateAndPrint(numberOne: Int =3, numberTwo: Int =4, operation: (Int, Int) -> Int) {
    var result = operation(numberOne, numberTwo)
    println("Result: $result")
}
//fun calculateAndPrint11(numberOne: Int = 3, numberTwo: Int = 4, operation: (Int) -> Int) {
//    val result2 = operation(numberOne)
//    println("Result $result2")
//}





