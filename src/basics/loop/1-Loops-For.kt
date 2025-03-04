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
     *      3 farkli sekilde for tanimlayabilirsiniz.
     *      value in list                       seklinde value degerlerini alabilirsiniz.
     *      index in list.indices               seklinde index degerlerini alabilirsiniz.
     *      (index,value) in list.withIndex()   seklinde index,value degerlerini alabilirsiniz.
     * **/

    for (value: Int in 1..10) {
        print("$value ")  // 1 2 3 4 5 6 7 8 9 10 u sirayla yazdirir.
    }

    val countryCodeArray = arrayOf("tr", "az", "en", "fr")

    for (value in countryCodeArray) {
        print("$value ")  //sirayla yazdirir
    }

    for (index in countryCodeArray.indices) {
        print("\n$index . değeri : ${countryCodeArray[index]} ")  //Degerlerde degil indexlerle de islem yapmamiz gerekebilir.
        // 0 . değeri : tr
        // 1 . değeri : az
        // 2 . değeri : en
        // 3 . değeri : fr yazdirir.
    }

    for ((index, value) in countryCodeArray.withIndex()) {  // ustteki ile ayni islem daha rahat
        print("\n$index . değeri : $value ")
    }

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      repeat(size) seklinde herhangi bir listeye ihtiyac duymadan tekrarlayan isler yapabilirsiniz.
     * **/
    repeat(10) {
        print("\nDaha çok blog yazmam lazım!")
    }

/* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      return kullanarak ilgili sart saglanirsa, donguden cikabilirsiniz.
     *      continue kullanarak ilgili sart saglanirsa, donguye o degeri atlayarak devam edebilirsiniz.
     * **/

    for (value in 1..50) {
        if (value % 2 == 1) {
            continue  // Normalde alta dogru devam eder ama continue oldugundan tekrar value islemini dondurur.
                // Eger ikiye tam bolunurse asagidaki print degerine geciyor. Yani ikiyle bolumden kalan birse devam 0 ise pronte geciyor.
        }
        print("\n$value")  // Yani ikiyle bolumden 0 kalanlar sifirin katlari bu sebeple 2 ve katlarini 50 ye kadar yazdirdi 2 4 6 8 .. 50
    }

    for (value in 1..50) {
        if (value % 2 == 1) {
            break   //Continue nun tam tersidir. Fakat islem break oldugunda tamamen donguden cikar. Yani printe gecmez direkt alt -
                   // -isleme gecer. Yani asagidaki for dongusune gecer. Elemani bul gerisini kontrol etme mantigiyla kullanilabilir.
        }
        print("\n$value")
    }

    /**
     *      Iç içe for donguleri kullaniyorsak bir ustteki for'a degil de iki ustteki uc ustteki for'a donmek istiyorsak
     *      label kullanabiliriz. bunun icin labelname@ ifadesini ilgili for'un onune yazip, return ya da continue yapacagimiz
     *      yere ise @labelname seklinde yazmamiz yeterlidir.
     * **/

    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue    // Burada contunie dedigimizde for value 2 icin donguye girecek. Fakat biz ustundeki for value icin  donguye -
                            //- girmesini istersek asagidaki returLable@ islemini kullanacagiz.
            }

            print("continue1 : $value2 | ")
        }
    }

    println("")

    returnLabel@ for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                continue@returnLabel  // Buradaki mantik for value 2 den degil de for value den devam et demek.
            }

            print("continue2 : $value2 | ")
        }
    }

    println("")

    for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                break
            }

            print("break1 : $value2 | ")
        }
    }

    println("")

    returnLabel@ for (value in 1..50) {
        for (value2 in 0..10) {
            if (value2 == 5) {
                break@returnLabel
            }

            print("break2 : $value2 | ")
        }
    }
}