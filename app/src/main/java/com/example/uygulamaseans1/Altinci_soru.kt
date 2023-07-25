import java.util.Scanner // Scanner sınıfını içeri aktarıyoruz.

/*fun main() {
    val scanner = Scanner(System.`in`) // Kullanıcıdan girdi almak için Scanner nesnesi oluşturuyoruz.

    print("Sayıyı giriniz: ") // Kullanıcıdan bir sayı girişi istiyoruz.
    val userIn = scanner.nextLine() // Kullanıcının girdisini bir String olarak alıyoruz.

    val sayi = userIn.toDoubleOrNull() // Girdiyi ondalıklı sayıya dönüştürüyoruz.

    if (sayi != null) { // Dönüştürme başarılıysa
        println("Girilen sayı: $sayi") // Kullanıcının girdiği sayıyı ekrana yazdırıyoruz.
    } else { // Dönüştürme başarısız ise (kullanıcı geçerli bir sayı girişi yapmamışsa)
        println("Geçersiz giriş. Lütfen sayı formatında bir giriş yapınız.") // Hatalı giriş uyarısını ekrana yazdırıyoruz.
    }
}*/

fun main() {
    println("sayı:")
    val girilenSayi = readLine()

    try {
        val ondalikliSayi = girilenSayi?.toInt()?.toDouble()
        println("Ondalıklı Sayı: $ondalikliSayi")
    } catch (e:Exception) {
        println("Hatalı giriş! Lütfen geçerli bir sayı giriniz.")
    }
}
