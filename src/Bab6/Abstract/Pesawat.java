/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6.Abstract;

/**
 *
 * @author ASUS
 */
public class Pesawat extends Kendaraan{
    int jmlSayap;

    public Pesawat() {
        this.jmlSayap = 2;
    }
    
    
    @Override
    public void setJeniskendaran(String jeniskendaran) {
        super.setJeniskendaran(jeniskendaran);
    }
    
    @Override
    String BahanBakar(){
        return " Menggunakan Bahan Bakar Aftur";
    }
}
