/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Project.TugasBab1;

/**
 *
 * @author ASUS
 */
public class RentalPSMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RentalPS sewa = new RentalPS(); // Membuat objek RentalPS

        // Mengatur data persewaan menggunakan method data
        sewa.dataKodeSewa("2218023"); // Mengatur kode sewa
        sewa.dataJenisPS("PS2"); // Mengatur jenis PS
        sewa.dataNamaPenyewa("Bagus Tri Al Ahmadi"); // Mengatur nama peminjam
        sewa.dataTanggalSewa("6 Agustus 2023"); // Mengatur tanggal sewa
        sewa.dataWaktuSewa(5); // Mengatur waktu sewa
        sewa.dataHargaPerJam(2000); // Mengatur biaya sewa
        sewa.TotalBiaya = sewa.waktuSewa * sewa.HargaPerJam; //Untuk menghitung total biaya yang harus dibayar
        
        // Menampilkan detail persewaan menggunakan method getter
        System.out.println("Kode Sewa: " + sewa.getKodeSewa()); // Mengambil kode sewa
        System.out.println("Jenis PS: " + sewa.getjenisPS()); // Mengambil jenis PS
        System.out.println("Nama Peminjam: " + sewa.getNamaPenyewa()); // Mengambil nama peminjam
        System.out.println("Tanggal Sewa: " + sewa.getTanggalSewa()); // Mengambil tanggal sewa
        System.out.println("Waktu Sewa: " + sewa.getWaktuSewa()); // Mengambil waktu sewa
        System.out.println("Harga/Jam : $" + sewa.getHargaPerJam()); // Mengambil biaya sewa perjam
        System.out.println("Biaya Total : " + sewa.getTotalBiaya()); //Mengambil biaya total penyewaan
    }
    
}
