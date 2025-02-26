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
     * Aynı türden ya da belirtilen türün alt türlerinden, sabit sayıda veri tutan bir veri yapısıdır.
     * En sık kullanılan versiyonu Object-Type Array 'lerdir. Array sınıfı ile temsil edilirler.
     *
     * Eğer primitive tipleri Object-Type Array olarak kullanırsanız Boxed kullanım yapmış olursunuz.
     * Bu da performansa etki eder. Eğer sadece primitive'lerden oluşan arrayler oluşturacaksanız,
     * bu durumda Primitive-Type Array'ler kullanın.
     * ByteArray(byte[]), ShortArray (short[]), IntArray(int[]), LongArray (long[]),
     * DoubleArray(double[]), FloatArray(float []),
     * BooleanArray (boolean[]), CharArray (char[])
     *
     *
     *      Dizi tanimlamalari icin kullanilirlar.
     *      arrayOf(ayni tip degerler) seklinde tanimlanabilir.
     *      arrayOf<Any>(farkli tip degerler) seklinde tanimlanabilir.
     *      arrayOfNulls<Type>(size) seklinde ise verilen boyut kadar null deger iceren dizi tanimlanabilir.
     *      epmtyArray() bos array tanimlar.
     * **/
//                       index =  0  1   2   3   4   5
    val studentNumbers = arrayOf(13, 45, 53, 54, 25, 10)
    val studentNames = arrayOf("Ahmet", "Ayşe", "Veli", "Derya")
    val firstCharOfNames = arrayOf('A', 'A', 'V', 'D')
    val mixedArray =
        arrayOf<Any>(13, "Ahmet", 'V', true)   // Tirnak icinde tipi belirtigimiz kisma da Interface-arayuz denir.

    val arrayOfNulls = arrayOfNulls<String>(4)
    println(arrayOfNulls.joinToString()) // null, null, null, null Ciktiris verir.

    val emptyArray = emptyArray<String>()
    var emptyArray2: Array<String> = emptyArray

    //  emptyArray[5] = "Ali" // Hata verir cunku empty arrayde index yoktur.

    var citiesArray = arrayOf("Istanbul", "Ankara", "Rize")

    citiesArray += "Bolu"
    //Birden fazla eleman eklemek icin
    citiesArray += arrayOf(
        "Kayseri",
        "Maras"
    ) // Bunu yapmak yeni bir array olusturuyor arka planda performans problemi olabilir
    println(citiesArray.joinToString()) // Istanbul, Ankara, Rize, Bolu, Kayseri, Maras yazdirdi.


    /* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      Array<Type>(size){higher order function} seklinde de tanimlanabilir.
     *      Bu durumda higher order function icerisinde son satira denk gelen degerler diziyi olusturur.
     *      Higher order function, icerisi dizinin boyutu kadar index'i(it) bir arttirarak calisir.
     * **/

    // 5 elamanli, her bir elemani index degeri ile 3.14'u carpan bir dizi olusturur.
    val carNamesMini = Array<Double>(5) {
//        pseudo Codes
//        pseudo Codes
//        pseudo Codes
        3.14 * it  // sonda return eder unutma yani 3.14 den once return yaziyor aslinda ama yazmiyor.
    }

    // 10 elemanli, 0-9 arasindaki index degerlerinin karesini alan bir dizi olusturur.
    // {0,1,2,4,9,16,25,36,49,81}
    val carNames = Array<Unit>(10) {
        println((it * it).toString())
    }

    /* -------------------------------------------------------------------------------------------------------------------*/

    /**
     *      ByteArray, ShortArray, IntArray, LongArray, DoubleArray, FloatArray gibi ya da bunların Unsigned halleri
     *      primitive array tanimlamalari da yapilabilir.
     *
     *      .toCharArray() gibi fonksiyonlar ile Object-Type bir array Primative-Typed bir array'e donusturulur.
     *      .toTypedArray() fonksiyonu ile Primative-Typed bir arrayi Object-Typed bir arreye donusturebilirsiniz.
     *
     *      Bu tarz tanimlamalarda ilgili index degerine atama icin set(index, value) ya da [index] = value kullanilabilir.
     *      Bu tarz tanimlamalarda ilgili index degerindeki degisken degerine get(index) ya da [index] seklinde ulasilabilir.
     * **/
    val firstCharOfCountries = CharArray(4)
    firstCharOfCountries[0] = 'T'
    firstCharOfCountries.set(1, 'İ')
    firstCharOfCountries.set(3, 'A')

    firstCharOfCountries[2] = 'B'

    val charSample: CharArray = arrayOf('T', 'I', 'B', 'I').toCharArray()
    //  val charSample2 : CharArray = arrayOf('T','I','B','I')

    println("firstCharOfCountrys index 2 :" + firstCharOfCountries.get(2))
    println("firstCharOfCountrys index 2 :" + firstCharOfCountries[2])

    /* -------------------------------------------------------------------------------------------------------------------*/
    /**
     *      val ile tanimlanmis bir array'in herhangi bir index'indeki deger degistirilebilir.
     *      val indexdeki degerlerin degismesine karismaz.
     *      Ancak ilgili diziyi baska bir dizi ile esitlemenize izin verilmez.
     *      Bunun icin tanimlamayi var ile degistirmeniz gerekir.
     * **/

    val awesomeArray = arrayOfNulls<String>(5)
    awesomeArray[2] = "Gökhan"
//    awesomeArray = arrayOf("foo", "boo", "goo", "doo", "loo") // Calismaz. Comment'i kaldir kontrol et istersen keko

    /**
     *      Array'in size'i disina cikiyorsaniz (boyutu disina) cikiyorsaniz, IndexOutOfBound hatasini alirsiniz.
     */
    awesomeArray[4] = "Mehtap"
//    awesomeArray[5] = "Mehtap" // Calismaz. Comment'i kaldir kontrol et istersen keko


    //2 boyutlu diziler
    val twoDArray = Array(size = 2) { Array<Int>(size = 2) { 0 } }
    println(twoDArray.contentDeepToString())
//  [[0, 0],  [0, 0]]


    // 3 boyutlu diziler
    val threeDArray = Array(3) { Array(size = 3) { Array<Int>(size = 3) { 0 } } }
    println(threeDArray.contentDeepToString())
//  [[[0, 0, 0] , [0, 0, 0], [0, 0, 0]], ->  Mesela ilk index 0 a 0 dir [0,0] yanindaki [0,1] yanindaki [0,2]
//  [[0, 0, 0] , [0, 0, 0], [0, 0, 0]],  ->  ikinci satirin ilk indexi [1,0] sonra [1,1] sonra [1,2]
//  [[0, 0, 0] , [0, 0, 0], [0, 0, 0]]]  ->  ucuncu satirin ilk indexi [2,0] sonra 2,1] sonra [2,2]
//  [3x3] matris

    val simpleArray = arrayOf(1, 2, 3)
    simpleArray[0] = 10
    twoDArray[0][0] = 2
    println(twoDArray[0][0]) // 2 sonucunu verir cunku bi ustte ilk indexi 2 olarak degistirdik

    //*vararg kelimesi ile istediğimiz sayıda parametreyi kabul edebiliriz.
    //* Eğer vararg'a denk gelecek şekilde bir array kullanmak istiyorsak "spread" "*" operatörü kullanırız.
    //* Spread operatoru verdiğiniz arrayin elemanlarının her birini bir variable olacak şekilde parametre olarak passlar.

    //*Array 'leri karşılaştırırken == operatörünü kullanamazsınız. == operatörü o array 'lerin referans object'lerini karşilastirir.
    //*contentEquals yada content DeepEquals kullanmanız lazım.

    val array1 = intArrayOf(1, 2, 3)
    val array2 = intArrayOf(1, 2, 3)
    if (array1 == array2) {             // Buna false verdi cunku yukarda dedigimiz gibi == arraylerde farkli calisiyor.
        println(true)                   // iki degiskenin saklandigi yerker farjki oldugu icin false verdi. Referanslar farkli.
    } else {
        println(false)
    }
    val array3 = array1
    val array4 =
        array1                // burada array 3 ve array 4 ayni value yani degeri isaret ettiginden true veriyor. Referanslar ayni.
    if (array3 == array4) {
        println(true)
    } else {
        println(false)
    }

    println(array1.contentEquals(array2)) // true  // Tek boyutlu arraylar icin bunu

    val array5 = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
    val array6 = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))

    println(array6.contentDeepEquals(array6)) // true  // Cok boyutlu arrayler icin bunu kullaniyoruz.

// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/ fonksiyon listesi

    /**
     * .sum() -> toplama işlemi; sadece number typed arrayler ile çalışır.
     * .shuffle() -> random karıştırma; elemanları random bir şekilde yer değiştirir.
     */


    val sumArray = arrayOf(1, 2, 3)
    println(sumArray.sum())

    val shuffledArray = arrayOf(1, 2, 3)
    shuffledArray.shuffle()
    println(shuffledArray.joinToString())

    shuffledArray.shuffle()
    println(shuffledArray.joinToString())

    /**
     *
     *Array'leri List'e ve Set'e dönüştürebilirsiniz. Set ayni degeri bir kez alir.
     *
     */
    val sampleArray = arrayOf("a", "b", "c", "c")
    println(simpleArray.toSet())  // [a, b, c]

    println(simpleArray.toList()) //[a, b, c, c]
/**
 *Map'lere de dönüştürebilirsiniz. Ancak bunun için array'in özel olarak Pari<K, V> formunda olması lazım.
 */


}