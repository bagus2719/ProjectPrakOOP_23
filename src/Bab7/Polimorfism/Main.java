/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bab7.Polimorfism;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        
        Buah apel = new Apel();
        Buah pisang = new Pisang();
        
        manusia.MakanBuah(apel);
        manusia.MakanBuah(pisang);
    }
    
}
