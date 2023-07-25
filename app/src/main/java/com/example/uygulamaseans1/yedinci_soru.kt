package com.example.uygulamaseans1

// Öğrenci sınıfımız
class ogrenci(val ad: String, val soyad: String, val sınıf: String)

fun main() {
    // Beş öğrenci nesnesi:
    val ogrenci1 = ogrenci("eda", "su", "4-A")
    val ogrenci2 = ogrenci("ece", "arı", "5-B")
    val ogrenci3 = ogrenci("asu", "bora", "1-C")
    val ogrenci4 = ogrenci("eren", "akay", "6-A")
    val ogrenci5 = ogrenci("deli", "meli", "2-D")

    // özellikleri ekrana yazdıran fonksiyon
    printBilgiler(ogrenci1)
    printBilgiler(ogrenci2)
    printBilgiler(ogrenci3)
    printBilgiler(ogrenci4)
    printBilgiler(ogrenci5)
}

//  nesne özelliklerini ekrana yazdıran fonksiyon
fun printBilgiler(ogrencim: ogrenci) {
    println("Ad: ${ogrencim.ad}")
    println("Soyad: ${ogrencim.soyad}")
    println("Sınıf: ${ogrencim.sınıf}")
    println()
}
