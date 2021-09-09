// Membuat class Sepatu dengan 4 parameter yaitu _brandModel, _ukuran, _warna, dan _harga
class Sepatu(_brandModel: String, _ukuran: ArrayList<Int>, _warna: ArrayList<String>, _harga: Int) {
    // Membuat 4 atribut untuk class Sepatu yaitu brandModel, ukuran, warna, dan harga
    var brandModel = _brandModel
    var ukuran = _ukuran
    var warna = _warna
    var harga = _harga

    // Membuat method untuk menampilkan detail informasi terkait sepatu, method ini tidak return/tidak mengembalikan nilai
    fun infoSepatu(){
        println("\n==== Informasi Sepatu $brandModel ====")
        // Split isi dari Atribut brandModel berdasarkan spasi dan memberi limit 2
        // karena hasil split pertama pasti brand, sedangkan hasil split berikutnya adalah model
        var splitBrandModel = brandModel.split(" ",limit = 2)
        println("Brand: ${splitBrandModel[0]} || Model: ${splitBrandModel[1]}")
        println("Ukuran: $ukuran")
        println("Warna: $warna")
        println("Harga: Rp $harga")
    }

    // Membuat method untuk menghitung harga setelah diskon, method ini return/mengembalikan nilai Int
    fun hitungHargaDiskon(): Int{
        var hargaSetelahDiskon = 0
        hargaSetelahDiskon = if (harga > 2000000){
            // Jika harga lebih dari 2 juta, maka diskon 20% atau 0.2
            (harga - harga*0.2).toInt()
        } else if (harga > 1000000){
            // Jika harga lebih dari 2 juta, maka diskon 10% atau 0.1
            (harga - harga*0.1).toInt()
        } else {
            // Jika 2 kondisi sebelumnya tidak terpenuhi, maka harga tetap dan tidak ada diskon
            harga
        }
        return hargaSetelahDiskon
    }
}

