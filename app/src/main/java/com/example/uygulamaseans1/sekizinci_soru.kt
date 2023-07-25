package com.example.uygulamaseans1
fun main() {
    // Meyve ve Elma nesnelerini oluşturuyoruz
    val elma1 = Elma("Kırmızı ", 8, "C vitamini")
    val elma2 = Elma("Yeşil ", 5, "A vitamini")
    val meyve1 = Meyve("Armut", 6)

    // Elma nesnesinin özelliklerini ekrana yazdırıyoruz
    println("Elma 1")
    println("Adı: ${elma1.ad}")
    println("Yiyebilir mi? ${elma1.yiyebilir()}")
    println()

    println("Elma 2")
    println("Adı: ${elma2.ad}")
    println("Tatlılık Derecesi: ${elma2.tatlilik}")
    println("Vitamin Değeri: ${elma2.vitaminDegeri}")
    println("Yiyebilir mi? ${elma2.yiyebilir()}")
    println()

    // Meyve nesnesinin özellikleri
    println("Meyve 1")
    println("Adı: ${meyve1.ad}")
    println("Tatlılık Derecesi: ${meyve1.tatlilik}")
}
