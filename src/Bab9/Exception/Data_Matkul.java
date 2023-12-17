/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab9.Exception;

import Bab8.Interface.*;
import Bab7.Polimorfism.*;
import Bab2.Constructors.*;

/**
 *
 * @author ASUS
 */
public class Data_Matkul {
    //atribut
    String kode_mk, nama_mk, dosen_pengampu;
    int jml_sks;
    
    //method
    public String KodeMatakuliah(){
        return kode_mk;
    }
    public String NamaMatakuliah(){
        return nama_mk;
    }
    public String DosenPengampu(){
        return dosen_pengampu;
    }
    public int JumlahSKS(){
        return jml_sks;
    }
}
