/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2.Constructors;

/**
 *
 * @author ASUS
 */
public class Luas_Segitiga {
    
    int alas, tinggi;
    double luas;
    
    public Luas_Segitiga(){
        this.alas = 10;
    }
    
    public double hitLuas(){
        luas = alas * tinggi;
        return luas;
    }
}
