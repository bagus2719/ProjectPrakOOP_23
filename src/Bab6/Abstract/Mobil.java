/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6.Abstract;

/**
 *
 * @author ASUS
 */
public  class Mobil extends Kendaraan{
    int jmlRoda;

    public Mobil() {
        this.jmlRoda = 4;
    }
    
    @Override
    public void setJeniskendaran(String jeniskendaran) {
        super.setJeniskendaran(jeniskendaran);
    }
    
    @Override
    String BahanBakar(){
        return " Menggunakan Bahan Bakar Pertamax";
    }
}
