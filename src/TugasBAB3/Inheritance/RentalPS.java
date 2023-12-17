/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBAB3.Inheritance;
/**
 *
 * @author ASUS
 */
public class RentalPS {
    
    // Atribut untuk menyimpan data persewaan PlayStation
    private String kodeSewa; // Kode sewa sebagai atribut pribadi agar hanya dapat diakses dalam kelas yang sama.
    String namaPenyewa;// Nama penyewa dengan tingkat akses default, dapat diakses dalam package yang sama.
    public String jenisPS; //Jenis PS dengan tingkat akses default, dapat diakses dalam packages yang sama.
    String tanggalSewa; // Tanggal sewa dengan tingkat akses default, dapat diakses dalam packages yang sama.
    private int waktuSewa; // Waktu sewa sebagai atribut pribadi agar hanya dapat diakses dalam kelas yang sama.
    private int HargaPerJam; // Harga per jam sebagai atribut pribadi agar hanya dapat diakses dalam kelas yang sama.
    private int TotalBiaya; // Total biaya sebagai atribut pribadi agar hanya dapat diakses dalam kelas yang sama.
    
    // konstruktor tanpa parameter
    public RentalPS(){
        this.kodeSewa = "2218023"; //Menginisialisasi nilai kode sewa dengan nilai default "PS001"
        this.jenisPS = "PS2"; //Menginisialisasi nilai jenis PS dengan nilai default "PS2"
        this.namaPenyewa = "Bagus Tri Al Ahmadi"; //Menginisialisasi nilai awal pada Nama Penyewa dengan nilai "Bagus Tri Al Ahmadi"
        this.tanggalSewa = "6 Agustus 2023"; //Menginisialisasi tanggal sewa dengan nilai awal "6 Agustus 2023" 
        this.waktuSewa = 5; //Menginisialisasi waktu sewa awal dengan nilai 5
        this.HargaPerJam = 3000; //Menginisialisasi nilai harga awal dengan nilai 5
        this.TotalBiaya = HargaPerJam * waktuSewa; //Menghitung total biaya berdasarkan harga dan waktu sewa
    }
    
    // Konstruktor dengan parameter
    public RentalPS(String kode, String nama, String jenis,String tanggal, int waktu, int Harga, int Total){
        this.kodeSewa = kode; // Menginisialisasi atribut kodeSewa dengan nilai dari argumen 'kode'
        this.jenisPS = jenis; // Menginisialisasi atribut jenisPS dengan nilai dari argumen 'jenis'
        this.namaPenyewa = nama; // Menginisialisasi atribut namaPenyewa dengan nilai dari argumen 'nama'
        this.tanggalSewa = tanggal; // Menginisialisasi atribut tanggalSewa dengan nilai dari argumen 'tanggal'
        this.waktuSewa = waktu; // Menginisialisasi atribut waktuSewa dengan nilai dari argumen 'waktu'
        this.HargaPerJam = Harga; // Menginisialisasi atribut HargaPerJam dengan nilai dari argumen 'Harga'
        Total = HargaPerJam * waktuSewa; // Menghitung total biaya berdasarkan harga per jam dan waktu sewa yang telah ditentukan
        this.TotalBiaya = Total; // Menginisialisasi atribut TotalBiaya dengan nilai total yang telah dihitung
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
    void dataTotalBiaya(int Total) {
        this.TotalBiaya = Total;
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
    // Method untuk mengambil total biaya sewa
    int getTotalBiaya() {
        return TotalBiaya;
    }
    
}
