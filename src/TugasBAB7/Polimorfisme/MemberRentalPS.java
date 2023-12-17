/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBAB7.Polimorfisme;

/**
 *
 * @author ASUS
 */
public class MemberRentalPS extends RentalPS{
    private int idMember; // Menggunakan private agar atribut ini hanya dapat diakses di dalam kelas yang sama
    public String namaMember; // Menggunakan public agar atribut ini dapat diakses dari luar kelas
    private String alamatMember; // Menggunakan private agar atribut ini hanya dapat diakses di dalam kelas yang sama
    public String jenisMember; // Menggunakan public agar atribut ini dapat diakses dari luar kelas
    
    public MemberRentalPS() {
        this.idMember = 0; // Default: ID Member 0
        this.namaMember = ""; // Default: Nama Member "" kosong
        this.alamatMember = ""; // Default: Alamat Member kosong
    }
    
    // Method untuk mengatur ID Member
    public void setIdMember(int id) {
        this.idMember = id;
    }    
    // Method untuk mengatur Nama Member
    public void setNamaMember(String nama) {
        this.namaMember = nama;
    }    
    // Method untuk mengatur Alamat Member
    public void setAlamatMember(String alamat) {
        this.alamatMember = alamat;
    }
    
    // Method untuk mendapatkan ID Member
    public int getIdMember() {
        return idMember;
    }    
    // Method untuk mendapatkan Nama Member
    public String getNamaMember() {
        return namaMember;
    }    
    // Method untuk mendapatkan Alamat Member
    public String getAlamatMember() {
        return alamatMember;
    }
    // Turunan method absract dari kelas induk untuk mendapatkan harga perjam sesuai jenis ps yang dipilih
    @Override
    public int getHargaPerJam() {
        switch (getJenisPS()) {
            case "PS2":
                return 2000;
            case "PS3":
                return 5000;
            case "PS4":
                return 7000;
            case "PS5":
                return 10000;
            default:
                return 0;
        }
    }
    // Turunan Method abstract dari kelas induk untuk menghitung total biaya
    @Override
    public int hitTotalBiaya() {
        return super.TotalBiaya;
    }
}