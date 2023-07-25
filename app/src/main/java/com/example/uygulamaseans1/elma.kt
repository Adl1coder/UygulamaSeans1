package com.example.uygulamaseans1

// Meyve sınıfından kalıtım alarak Elma sınıfını oluşturuyoruz
class Elma(ad: String, tatlilik: Int, val vitaminDegeri: String) : Meyve(ad, tatlilik) {
    // Elma sınıfına özgü bir metot ekliyoruz
    fun yiyebilir(): Boolean {
        return tatlilik >= 7
    }
}
