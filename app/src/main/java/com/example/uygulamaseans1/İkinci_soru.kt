/* fun main() {

    if (asalMi(14)){
        println("asal")
    }else{
        println("asal değil")
    }
}

fun asalMi(sayi: Int): Boolean {
    if (sayi < 2) return false

    for (i in 2..(sqrt(sayi.toDouble()).toInt())) {
        if (sayi % i == 0) {
            return false
        }
    }
    return true
}
Farklı Bir yol:
fun aralarındaAsal(x : Int,  y : Int) : Boolean{
    val xAsalcarpanlar  = ArrayList<Int>()
    val yAsalcarpanlar  = ArrayList<Int>()
    xAsalcarpanlar.add(x)
    yAsalcarpanlar.add(y)
    for(i in 2..x/2){
        if(x % i == 0){
            xAsalcarpanlar.add(i)
        }
    }
    for(i in 2..y/2){
        if(y % i == 0){
            yAsalcarpanlar.add(i)
        }
    }
     for(i in 0..xAsalcarpanlar.size-1) {
         if (xAsalcarpanlar[i] != null) {
             for (j in 0..yAsalcarpanlar.size - 1) {
                 if(xAsalcarpanlar[i] == yAsalcarpanlar[j]) {
                     println("aralarında asal değil.")
                     return true
                 }
             }
         }
     }
    println("aralarında asal.")
    return false
}
Diğer:
fun main() {
var a = readLine()!!.toInt()
var i = 1;
var d= 1;
while (i<=a) {
    d*=i;
    i++;
}
println("${a}!=${d}")
}

*/

package com.example.uygulamaseans1

fun main() {
    val sayi1 = 13
    val sayi2 = 17

    if (isPrime(sayi1)) {
            println("$sayi1 asaldır.")
        } else {
        println("$sayi1 asal değildir.")
    }

    if (isPrime(sayi2)) {
        println("$sayi2  asaldır.")
    } else {
        println("$sayi2  asal değildir.")
    }
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }

    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}