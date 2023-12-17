/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab7.Polimorfism;

/**
 *
 * @author ASUS
 */
public class G0001 extends Pembayaran{
    public String name, alamat;
    public int saldo;
    public String kode;
    double diskon, bayar, total;
    
    public G0001(){
        this.name = "Bagus Tri Al Ahmadi";
        this.kode = "G0001";
        this.saldo = 50000;
        this.alamat = "Jember, Jl.KH.Hasyim";
    }
    
    public double Hasil(){
        return diskon;
    }
    
    @Override
    double cekKode(String input){
        if(input.compareTo(kode) == 0){
            diskon = 0.2;
        }else{
            diskon = 0;
        }
        return diskon;
    }
    
    @Override
    double hitPembayaran(double bayar){
            diskon = bayar * diskon;
            total = bayar - diskon;
            return total;
    }
    double potSaldo(){
        return this.saldo - total;
    }
    
    @Override
    void tampilkanMember(){
        System.out.println("Member G0001 dengan dsikon 10%");
    }
}
