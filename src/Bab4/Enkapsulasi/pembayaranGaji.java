/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab4.Enkapsulasi;

/**
 *
 * @author ASUS
 */
public class pembayaranGaji {
    private String nomorRekening;
    private String input;
    private double saldo;
    public pembayaranGaji(){
        this.nomorRekening = "B2218023";
        this.saldo = 100000;
    }
    
    public String getNomorRekening(){
        return nomorRekening;
    }
    public void setNomorRekening(String nomorRekening){
        this.nomorRekening = nomorRekening;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public String getInput(){
        return input;
    }
    public void setInput(String input){
        this.input = input;
    }
    public double cekSaldo(){
        if(getNomorRekening().equals(getInput())){
            return getSaldo();
        } else{
            return 0;
        }
    }
}
