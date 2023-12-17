/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bab4.Enkapsulasi;

/**
 *
 * @author ASUS
 */
public class mainGaji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pembayaranGaji gaji = new pembayaranGaji();
        
        gaji.setInput("B2218023");
        System.out.println("Rekening Yang Anda Masukkan : " + gaji.getInput());
        System.out.println("Jumlah Saldo Anda : " + gaji.cekSaldo());
        
    }
    
}
