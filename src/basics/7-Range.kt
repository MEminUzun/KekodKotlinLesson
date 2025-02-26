package basics

// Code with ❤️
//┌────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK   │
//│ ────────────────────────── │
//│ GokhanOZTURK@AndroidEdu.IO │            
//│ ────────────────────────── │
//│ 9.05.2021                  │
//└────────────────────────────┘

fun main() {

    /**
     *      Sonlu sayili liste olusturmaya yarar.
     * **/

    /**
     *      Kucukten buyuge liste olusturmak icin
     *      ".." operatorunu, ya da "rangeTo()"
     *      "..<"operatorunu ya da "rangeUntil()"
     *       fonksiyonunu kullanabilirsiniz.

     * **/
    val numbers = 1..100 // [1,100]
    val numbers2 = 1.rangeTo(100)
//    val numbers3 = 1 rangeTo 100

    val numbersUntil = 1..<100 // [1,100) Son sayi dahil degil == [1,99]
    val numbersUntil2 = 1. rangeTo(100)
//    val numbersUntil3 = 1 rangeTo 100

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Char'lardan olusan bir liste de tanimalanbilir. Turkce karakterleri icermez.
     * **/
    val alphabet = 'A'..'Z'

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Buyukten kucuge .. operatorunu kullanarak liste olusturamayiz. Ide hata verecektir.
     *      Buyukten kucuge liste olusturmak icin downTo() fonksiyonunu kullanabilirsiniz. Infix kullanimi da vardir.
     * **/

    //    val reversedNumbers = 100..1 // Calismaz. Comment'i kaldir kontrol et istersen keko
    val reversedNumbers = 100.downTo(1)
    val reversedNumbers2 = 100 downTo 1
    print("reversedNumbers")
    reversedNumbers.forEach { print(" " + it) }
    println()

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      until fonksiyonunu kullanarak da range tanimalanabilir. Ancak bu durumda bitis degeri listeye dahil edilmez.
     * **/
    val gradeNumbers = 10.until(100) // [10,100)
//    val gradeNumbers2 = 10.rangeTo(99) // [10,100)
//    val gradeNumbers3 = 10..99 // [10,100)
    val gradeNumbers2 = 10 until 100
    print("gradeNumbers")
    gradeNumbers.forEach { print(" " + it) }
    println()

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      step fonksiyonunu kullanarak liste olusturulurken belli sayida atlamalar yapabilirsiniz.
     * **/
    val stepedNumbers = 1..101 step (2)   // Birden basla 101 e kadar ikiser ikiser git demek
    val stepedNumbers2 = 1..100 step 3
    print("stepedNumbers")
    stepedNumbers.forEach { print(" " + it) }
    println()

    val reversedStepedNumbers = 100 downTo 1 step (3) // 100 den basla geriye dogru 3 er 3 er say.
    val reversedStepedNumbers2 = 100.downTo(100) step 2
    print("reversedStepedNumbers")
    reversedStepedNumbers.forEach { print(" " + it) }
    println()

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      CharRange, IntRange ve LongRange gibi ozel rangeler vardir. Progression olarak adlandirilir.
     *      diger tipler bulunmaz
     *      Bu durumda, first, last, step, count gibi ek bilgiler alinabilir.
     *      Iterable<N> interface'ini implement etmislerdir. O sebeple map filter gibi fonksiyonlari kullanabilirler.
     * **/
    val numberList: IntRange = 10 until 90
    numberList.first
    numberList.last
    numberList.step

    when (10) {
        in numberList -> {
            println("10 sayisi numberList icerisinde yer alir")
        }
    }

    numberList.count() // sayma anlamina gelir

    val countBiggerThan50 = numberList.count { it > 50 }  // 50 den buyuk kac deger vardir diyor. Yukarida numberlistimiz 90 a kadardi
                                                          // 50 den buyuk 90 dan kucuk yani 51..89 a kadar 39 deger vardir.

    println(countBiggerThan50)

    println("numberList.average ${numberList.average()}")  // ortalama alir
    println("numberList.reversed ${numberList.reversed()}") // tersine cevirir

    println((1..100).filter { it % 2 == 0 }) // ikiye tam bolunen sayilari yazdiriyor yani 2 4 6 8 ... 100 e kadar ikiser sayiyor
}