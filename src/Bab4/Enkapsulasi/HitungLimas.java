/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4.Enkapsulasi;

/**
 *
 * @author ASUS
 */
public class HitungLimas {
    private double LuasAlas;
    public double Tinggi;
    double volume;
    
    public double getLuasAlas(){
        return LuasAlas;
    }
    public void setLuasAlas(double LuasAlas){
        this.LuasAlas = LuasAlas;
    }
    double volumeLimas() {
        volume = (1.0/3.0) * LuasAlas * Tinggi;
        return volume;
    }
}
