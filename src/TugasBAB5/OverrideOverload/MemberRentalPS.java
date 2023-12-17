/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasBAB5.OverrideOverload;

/**
 *
 * @author ASUS
 */
public class MemberRentalPS extends RentalPS{
    private int idMember;
    public String namaMember;
    private String alamatMember;
    public String jenisMember;
    private int Discount;

    public MemberRentalPS() {
        this.idMember = 0;
        this.namaMember = "";
        this.alamatMember = "";
    }

    // Method override untuk mendapatkan informasi waktu sewa dengan menambahkan ID member
    @Override
    public int getWaktuSewa() {
        return super.getWaktuSewa();
    }

    // Method overload untuk mengatur ID member, nama member, dan alamat member
    public void dataMember(String inputNama, int inputId, String inputAlamat) {
        this.namaMember = inputNama;
        this.idMember = inputId;
        this.alamatMember = inputAlamat;
    }
    //Method untuk mengatur nilai diskon
    public void dataDiscount(int Disc){
        this.Discount = Disc;
    }
    // Getter untuk mendapatkan informasi ID member
    public int getIdMember() {
        return idMember;
    }
    // Getter untuk mendapatkan informasi nama member
    public String getNamaMember() {
        return namaMember;
    }
    // Getter untuk mendapatkan informasi alamat member
    public String getAlamatMember() {
        return alamatMember;
    }
    //Method getter untuk mengambil nilai diskon
    public int getDiscount(){
        return Discount;
    }
    //Method Override yang digunakan untuk mengambil nilai total biaya
    @Override
    int getTotalBiaya() {
        return TotalBiaya;
    }
}
