package basics.controlflow

// Code with ❤️
//┌────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK   │
//│ ────────────────────────── │
//│ GokhanOZTURK@AndroidEdu.IO │            
//│ ────────────────────────── │
//│ 22.05.2021                 │
//└────────────────────────────┘

fun main(args: Array<String>) {

    var numberOne = 10
    val numberTwo = 5

    println("NumberOne : ${numberOne}") // NumberOne : 10
    println("NumberOne : ${numberOne++}") //NumberOne : 10 ++ degerini sona koyarsak once islemi yapiyor sonra ekliyor.
    println("NumberOne : ${numberOne}") //NumberOne : 11
    println("NumberOne : ${++numberOne}") //NumberOne : 12 ++ degerini once koyarsak direkt ekliyor sonra islemi yapiyor.

    print("${numberOne + numberTwo} ")
    print(" ")                              // ister + isareti ile ister .plus fonksiyonuyla yap ayni seydir.
    println(numberOne.plus(numberTwo))      // Asagidaki cikarma carpma bolme icin de ayni mantik ister sembollerle ister fonk ile.

    print("${numberOne - numberTwo} ")
    println(numberOne.minus(numberTwo))

    print("${numberOne * numberTwo} ")
    println(numberOne.times(numberTwo))

    print("${numberOne / numberTwo} ")
    println(numberOne.div(numberTwo))

    print("${numberOne % numberTwo} ")   // bu yuzde alma degil bolunenden kalan kactir onu verir 10 % 3 = 1
    println(numberOne.rem(numberTwo))

    println("------------------------------------------------------------")

    print("Final Notunu Giriniz : ")
    val grade = readLine()!!.toInt()

    val charNote = if (grade == 100) {
        "$grade = AA"
    } else if (grade <= 99 && grade >= 80) {
        "$grade = BB"
    } else if (grade <= 79 && grade >= 50) {
        "$grade = CC"
    } else if (grade <= 49 && grade >= 20) {
        "$grade = DD"
    } else if (grade <= 19 && grade >= 0) {
        "$grade = FF"
    } else {
        "$grade = Bulunamadı!!"
    }

    println("------------------------------------------------------------")

    println(grade.compareTo(100) == -1)   //65 girdiginmizi varsayar isek grade = 65 100 den kucuk oldugundan -1 dondu ve true verdi
    println(grade.compareTo(100) == 1)    //grade degeri 100 den buyuk olsaydi 1 verecekti. Burada false verdi
    println(grade.compareTo(100) == 0)    // grade degeri 100 e esitse 0 verecek. Burada false verdi
    println(grade.equals(100))
    println(grade.equals(100))
    println(!grade.equals(100))

    println(charNote)

    /*
    a < b   a.compareTo(b) < 0
    a > b   a.compareTo(b) > 0
    a >= b  a.compareTo(b) >= 0
    a <= b  a?.equals(b)?: (b === null)
    a == b  a?.equals(b)?: (b === null)
    a != b  !(a?.equals(b)?: (b === null))
    */

    println("------------------------------------------------------------")

    var a = 20
    var b = 5
    a += b  // a = a + b
    //println("a+=b :" + a += b) //     atama islemi varsa stringe yazilmaz. Atama islemi esittir demektir. a= a+b olarak yazilamaz bu yuzden
    println("a+=b : + ${a.plus(b)}") // = bu sekilde yazilabilir atama islemi olmadan 30 olur
    println("a+=b :" + a) // = 25
    a -= b  // a = a - b
    println("a-=b :" + a) // = 20
    a *= b  // a = a * b
    println("a*=b :" + a) // = 100
    a /= b  // a = a / b
    println("a/=b :" + a) // = 20
    a %= b  // a = a % b
    println("a%=b :" + a) // = 0

    /*  Fonksiyon halleridir.
    	a+=b    a.plusAssign(b)
    	a-=b    a.minusAssign(b)
        a*=b    a.timesAssign(b)
        a/=b    a.divAssign(b)
        a%=b    a.remAssign(b)
     */

    println("------------------------------------------------------------")

    var numbOne = 10
    var numbTwo = 5
    var flag = true
    println("+a :" + +numbOne)  //tek arti veya tek eksi varsa bundaki ve bi alttaki gibi bu isareti belirler. Pozirif mi negatif mi.
    println("q-b :" + -numbTwo)
    println("++a :" + ++numbOne) // Bunu en ustte isledik zaten
    println("a++ :" + numbOne++) // Bunu da
    println("a :" + numbOne)
    println("--b :" + --numbTwo)
    println("!flag :" + !flag)  // True olan degeri false cevirdi.
    println("!flag :" + flag.not()) // Ustekiyle ayni isi gorur bunu kullanmak gorunurluk acisindan daha iyidir.


    var c = 20
    var d = 30
    var e = true
    println(c.inc()) // = 21
    println(c.dec()) // = 19
    println(d.unaryPlus()) // -30 olarak aldi
    println(c.unaryMinus()) // -20 olarak aldi
    println(e.not()) // false verdi

    /*
                Fonksiyon halleri.
    	+a      a.unaryPlus()
    	-a      a.unaryMinus()
    	++a     a.inc()
        --a     a.dec()
    	!a      a.not()
     */

    println("------------------------------------------------------------")

    /**
     *
     *      === ifadesi isaret edilen referans tipleri karsilatirir.
     *      == ifadesi degeri karsilastirir.
     */
}