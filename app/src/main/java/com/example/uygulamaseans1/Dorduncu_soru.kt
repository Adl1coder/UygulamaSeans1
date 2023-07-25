package com.example.uygulamaseans1

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Birinci sayı: ")
    val sayı1 = scanner.nextDouble() // Kullanıcıdan birinci sayıyı alır.

    print("İkinci sayı: ")
    val sayı2 = scanner.nextDouble() // Kullanıcıdan ikinci sayıyı alır.

    hesapla_yazdir(sayı1, sayı2) // Aldığı iki sayı için hesaplamaları yapar ve sonuçları ekrana yazdırır.
}

// İki sayının toplamını, farkını, çarpımını ve bölümünü hesaplayıp ekrana yazdıran fonksiyon
fun  hesapla_yazdir(a: Double, b: Double) {
    // Toplama işlemini yapar ve sonucu ekrana yazdırır.
    println("Toplam: ${a + b}")

    // Fark işlemini yapar ve sonucu ekrana yazdırır.
    println("Fark: ${a - b}")

    // Çarpma işlemini yapar ve sonucu ekrana yazdırır.
    println("Çarpım: ${a * b}")

    // Bölme işlemini yapar ve sonucu ekrana yazdırır. Eğer bölen 0 ise sonsuz değeri ekrana yazdırır.
    if (b != 0.0) {
        println("Bölüm: ${a / b}")
    } else {
        println("Bölüm: Sonsuz (Bölen 0 olduğu için bölme yapılamaz.)")
    }
}
