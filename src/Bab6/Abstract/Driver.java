/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bab6.Abstract;

/**
 *
 * @author ASUS
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobil mbl = new Mobil();
        Pesawat pswt = new Pesawat();
        
        mbl.jeniskendaran = "Avanza";
        mbl.jmlRoda = 4;
        System.out.println(mbl.jeniskendaran + " Memiliki Roda " + mbl.jmlRoda + " Dan " +mbl.BahanBakar());
        
        
        pswt.jeniskendaran = "Garuda Indonesia";
        pswt.jmlSayap = 2;
        System.out.println(pswt.jeniskendaran + " Memiliki Roda " + pswt.jmlSayap + " Dan " +pswt.BahanBakar());
        
    }
    
}
