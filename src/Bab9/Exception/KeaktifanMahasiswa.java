/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9.Exception;

import Bab8.Interface.*;
import Bab6.Abstract.*;

/**
 *
 * @author ASUS
 */
public class KeaktifanMahasiswa extends Penilaian{
    int nilai_keaktifan;
    public KeaktifanMahasiswa(){
        this.nilai_keaktifan = 0;
    }
    @Override
        public double nilaiKeaktifan(){
        return ((nilai_keaktifan* 0.1) + nilaiAkhir());
    } 
}
