/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6.Abstract;

/**
 *
 * @author ASUS
 */
public abstract class Kendaraan {
    
    String jeniskendaran;

    public void setJeniskendaran(String jeniskendaran) {
        this.jeniskendaran = jeniskendaran;
    }
    
    abstract String BahanBakar();
}
