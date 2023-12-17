/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab6.Abstract;

/**
 *
 * @author ASUS
 */
public class Gaji_reward extends Gaji_abs_reward{
    double menit;
    double waktu;
    double tunj_bonus;
    double gajiPokok;
    double tunj_anak;
    double anak;

    @Override
    double tunjanganAnak() {
        if (anak == 1) {
            return tunj_anak = 0.1 * gajiPokok;
        } else if (anak >= 2) {
            return tunj_anak = 0.2 * gajiPokok; 
        } else {
            return tunj_anak = gajiPokok;
        }
    }

    @Override
    double lembur() {
        waktu = menit / 60;
        tunj_bonus = waktu * 25000;
        return tunj_bonus;
    }
}
