/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bab7.Polimorfism;

/**
 *
 * @author ASUS
 */
public class Main_Pembayaran {
    public static void main(String[] args) {
        Pembayaran payment;
        payment = new P0001();
        payment = new G0001();
        
        payment.tampilkanMember();
        
        if(payment instanceof P0001){
            P0001 p0001 = (P0001) payment;
            
            System.out.println("Jenis Member : " + p0001.member(p0001));
            System.out.println("Total Pembelian : " + p0001.hitPembayaran(12000));
            System.out.println("Sisa Saldo : " + p0001.potSaldo());
        }else if(payment instanceof G0001){
            G0001 g0001 = (G0001) payment;
            
            System.out.println("Jenis Member : " + g0001.member(g0001));
            System.out.println("Total Pembelian : " + g0001.hitPembayaran(12000));
            System.out.println("Sisa Saldo : " + g0001.potSaldo());
        }
    }
    
}
