package com.example.uygulamaseans1

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Lütfen adınızı giriniz: ")
    val name = scanner.nextLine()

    print("Lütfen yaşınızı giriniz: ")
    val age = scanner.nextInt()

    println("Merhaba, $name! $age yaşındasınız.")
}
