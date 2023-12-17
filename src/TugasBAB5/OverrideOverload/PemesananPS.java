/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBAB5.OverrideOverload;

/**
 *
 * @author ASUS
 */
public class PemesananPS extends RentalPS {
    //Atribut yang digunakan untuk menyimpan data pada kelas Pemesanan PS
    private String seriPS;
    public String statusPembayaran;
    int stok;
    
    //Constructors yang digunakan untuk menginisialisasi nilai awal atribut 
    public PemesananPS() {
        this.namaPenyewa = "";
        this.seriPS = "";
        this.stok = 0;
        this.statusPembayaran = "";
    }
    
    // Method untuk mengatur nilai dari seri PS dan Stok PS
    public void dataSeriStokPS(String inputSeri, int inputStok) {
        this.seriPS = inputSeri;
        this.stok = inputStok;
    }
    
    // Method override yang digunakan untuk mengambil nilai total biaya
    @Override
    public int getTotalBiaya() {
        return super.TotalBiaya;
    }
    
    //Method override yang untuk mengambil nilai KodeSewa
    @Override
    public String getKodeSewa() {
        return super.getKodeSewa();
    }

    //Method untuk mengambil nilai dari Seri PS
    public String getSeriPS() {
        return seriPS;
    }

    // Method untuk mengambil nilai dari Stok PS
    public int getStokPS() {
        return stok;
    }
}