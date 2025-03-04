package basics.loop

// Code with ❤️
//┌────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK   │
//│ ────────────────────────── │
//│ GokhanOZTURK@AndroidEdu.IO │            
//│ ────────────────────────── │
//│ 22.05.2021                 │
//└────────────────────────────┘

fun main() {

    /**
     *      Degisen hic bir sey yok. Diger dillerde nasil kullaniyorsaniz Kotlin'de de ayni sekilde kullaniyoruz.
     *      Eger bir donguye ihtiyaciniz varsa ve bu dongu sirasinda if else ile bir sartli duruma ihtiyaciniz varsa
     *      bu durumda for + if else kullanmak yerine while kullanabilirsiniz.
     * **/

    var number = 0

    while (number < 5) {
        print("${number++} , ")  // 0 , 1 , 2 , 3 , 4 , verir.
    }

    while (number < 5) {
        print("$number , ") // 0 , 1 , 2 , 3 , 4 , verir.
        number++
    }



    for (value in 0..110) {
        if (value < 5) {
            println("$value , ") // usttekilerle ayni kodu verir sadece for if yazim seklidir.
        } else {
            break  // Buraya return dersek donguden degil fonksiyondan cikariz o yuzden break kullandik.
        }
    }
}