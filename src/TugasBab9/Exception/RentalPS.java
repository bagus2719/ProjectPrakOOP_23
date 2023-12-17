/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBab9.Exception;

import TugasBAB8.Interface.*;
import TugasBAB7.Polimorfisme.*;
import TugasBAB3.Inheritance.*;

/**
 *
 * @author ASUS
 */
public abstract class RentalPS {
    // Atribut untuk menyimpan data persewaan PlayStation
    private String kodeSewa; // Kode sewa sebagai atribut pribadi agar hanya dapat diakses dalam kelas yang sama.
    String namaPenyewa;// Nama penyewa dengan tingkat akses default, dapat diakses dalam package yang sama.
    public String jenisPS; //Jenis PS dengan tingkat akses default, dapat diakses dalam packages yang sama.
    String tanggalSewa; // Tanggal sewa dengan tingkat akses default, dapat diakses dalam packages yang sama.
    private int waktuSewa; // Waktu sewa sebagai atribut pribadi agar hanya dapat diakses dalam kelas yang sama.
    private int HargaPerJam; // Harga per jam sebagai atribut pribadi agar hanya dapat diakses dalam kelas yang sama.
    public int TotalBiaya; // Total biaya sebagai atribut pribadi agar hanya dapat diakses dalam kelas yang sama.
    
    // konstruktor tanpa parameter
    public RentalPS(){
        this.kodeSewa = ""; //Menginisialisasi nilai kode sewa dengan nilai default
        this.jenisPS = ""; //Menginisialisasi nilai jenis PS dengan nilai default
        this.namaPenyewa = ""; //Menginisialisasi nilai awal pada Nama Penyewa dengan nilai default
        this.tanggalSewa = ""; //Menginisialisasi tanggal sewa dengan nilai awal default
        this.waktuSewa = 0; //Menginisialisasi waktu sewa awal dengan nilai default
        this.HargaPerJam = 0; //Menginisialisasi nilai harga awal dengan nilai default
        this.TotalBiaya = HargaPerJam * waktuSewa; //Menghitung total biaya berdasarkan harga dan waktu sewa
    }
    
    // Method untuk mengatur kode sewa
    void dataKodeSewa(String inputkode) {
        this.kodeSewa = inputkode;
    }
    // Method untuk mengatur nama peminjam
    void dataNamaPenyewa(String inputnama) {
        this.namaPenyewa = inputnama;
    }
        // Method untuk mengatur tanggal sewa
    void dataTanggalSewa(String inputtanggal) {
        this.tanggalSewa = inputtanggal;
    }
    // Method untuk mengatur waktu sewa
    void dataWaktuSewa(int inputwaktu) {
        this.waktuSewa = inputwaktu;
    }
    // Method untuk mengatur harga sewa
    void dataJenisPS(String JenisPS){
        this.jenisPS = JenisPS;
    }
    
    // Method untuk mengambil kode sewa
    String getKodeSewa() {
        return kodeSewa;
    }
    // Method untuk mengambil nama peminjam
    String getNamaPenyewa() {
        return namaPenyewa;
    }
    // Method untuk mengambil tanggal sewa
    String getTanggalSewa() {
        return tanggalSewa;
    }
    // Method untuk mengambil waktu sewa
    int getWaktuSewa() {
        return waktuSewa;
    }
    // Method untuk mengambil jenis ps
    String getJenisPS(){
        return jenisPS;
    }
    public abstract int getHargaPerJam(); // Method abstract untuk mendapatkan Harga sewa per Jam    
    public abstract int hitTotalBiaya(); // Method abstract untuk meghitung Total Biaya Sewa
}