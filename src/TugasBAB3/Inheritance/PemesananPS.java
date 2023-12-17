/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBAB3.Inheritance;

/**
 *
 * @author ASUS
 */
public class PemesananPS extends RentalPS {
    private String seriPS; // Menggunakan private untuk menjaga privasi dan hanya dapat diakses di dalam kelas yang sama.
    public String statusPembayaran; // Menggunakan public agar dapat diakses dari luar kelas.
    int stok; // Menggunakan tingkat akses default sehingga dapat diakses dalam package yang sama.
    
    public PemesananPS(){
        this.namaPenyewa = "";
        this.seriPS = "";
        this.stok = 0;
        this.statusPembayaran = "";
    }
    
    // Method untuk mengatur informasi seri PlayStation yang dipesan
    public void dataSeriPS(String inputSeri) {
        this.seriPS = inputSeri;
    }
    // Method untuk mengatur jumlah stok PlayStation yang tersedia
    public void dataStokPS(int inputStok) {
        this.stok = inputStok;
    }
    // Method untuk mendapatkan informasi seri PlayStation yang dipesan
    public String getSeriPS() {
        return seriPS;
    }
    // Method untuk mendapatkan jumlah stok PlayStation yang tersedia
    public int getStokPS() {
        return stok;
    }
}
