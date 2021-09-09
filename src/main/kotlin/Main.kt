// Nama: Albertus Adrian Susanto
/*
Soal:
Andi adalah seorang pemilik toko sepatu bernama Star Shoe. Anda sebagai teman Andi yang baik ingin membuatkan sebuah program yang dapat memudahkan pengunjung dalam mendapatkan detail informasi terkait sepatu yang ingin dibeli oleh mereka. Program ini dapat menampilkan informasi lengkap mulai dari brand dan model sepatu, ukuran dan warna yang tersedia, serta perbandingan antara harga asli dengan harga setelah diskon. Diskon pada toko tersebut memiliki ketentuan sebagai berikut:
a. Jika harga sepatu lebih dari 2 juta, maka diskon 20%
b. Jika harga sepatu lebih dari 1 juta, maka diskon 10%
c. Jika harga sepatu kurang dari atau sama dengan 1 juta, maka tidak diskon

Input:
- User memilih sepatu berdasarkan nomor
Output:
- Detail informasi terkait sepatu
 */

import java.util.*

fun main(args: Array<String>) {
    // Membuat object reader dari class scanner
    val reader = Scanner(System.`in`)
    println("=== Selamat datang di Star Shoe ===")
    println("1. Nike Zoom Freak 3")
    println("2. Nike Jordan Delta 2")
    println("3. Adidas Ultraboost 5.0 DNA")
    println("4. Adidas Galaxy 5")
    // Input pilihan
    print("Halo Kak, mau cari sepatu apa? [1-4]: ")
    var pilih = reader.nextInt()
    if (pilih == 1){
        // Membuat object nikeZoom dari class Sepatu
        val nikeZoom = Sepatu("Nike Zoom Freak 3",arrayListOf<Int>(40, 41, 42, 43, 44, 45, 46), arrayListOf<String>("Black","White","Blue"),1800000)
        // Menggunakan method infoSepatu() pada object nikeZoom
        nikeZoom.infoSepatu()
        // Menggunakan method hitungHargaDiskon() pada object nikeZoom
        println("Harga setelah diskon: Rp ${nikeZoom.hitungHargaDiskon()}\n")
    } else if (pilih == 2){
        // Membuat object nikeJordan dari class Sepatu
        val nikeJordan = Sepatu("Nike Jordan Delta 2", arrayListOf<Int>(40, 42, 44, 46), arrayListOf<String>("Dark Smoke Grey", "Particle Grey"),1980000)
        // Menggunakan method infoSepatu() pada object nikeJordan
        nikeJordan.infoSepatu()
        // Menggunakan method hitungHargaDiskon() pada object nikeJordan
        println("Harga setelah diskon: Rp ${nikeJordan.hitungHargaDiskon()}\n")
    } else if (pilih == 3) {
        // Membuat object adidasUltraboost dari class Sepatu
        val adidasUltraboost = Sepatu("Adidas Ultraboost 5.0 DNA", arrayListOf<Int>(36,37,38,39,40), arrayListOf<String>("Black", "Red"),2800000)
        // Menggunakan method infoSepatu() pada object adidasUltraboost
        adidasUltraboost.infoSepatu()
        // Menggunakan method hitungHargaDiskon() pada object adidasUltraboost
        println("Harga setelah diskon: Rp ${adidasUltraboost.hitungHargaDiskon()}\n")
    } else if (pilih == 4) {
        // Membuat object adidasPulse
        val adidasGalaxy = Sepatu("Adidas Galaxy 5", arrayListOf<Int>(46,47), arrayListOf<String>("White", "Blue"),750000)
        // Menggunakan method infoSepatu() pada object adidasGalaxy
        adidasGalaxy.infoSepatu()
        // Menggunakan method hitungHargaDiskon() pada object adidasGalaxy
        println("Harga setelah diskon: Rp ${adidasGalaxy.hitungHargaDiskon()}\n")
    } else {
        println("\nPilihan Anda tidak tersedia!")
    }
}