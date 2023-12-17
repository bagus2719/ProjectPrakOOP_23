/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB8.Interface;

/**
 *
 * @author mza
 */
public class Payment extends Purchase implements Cash, Credit, Emoney{
    double total, CreditBalance, EmoneyBalance, CashBalance;

    public Payment() {
        this.CreditBalance = 1000000;
        this.EmoneyBalance = 500000;
        this.CashBalance = 1500000;
        this.total = 750000;
    }
    
    @Override
    void titlePurchase(int numberPurchase){
        System.out.println("Pembelian ke- "+ numberPurchase);
    }
    @Override
    public double cashProses(){
        total = CashBalance - this.total;
        return total;
    }
    @Override
    public double creditProses(){
        total = CreditBalance - this.total;
        return total;
    }
    @Override
    public double emoneyProses(){
        total = EmoneyBalance - this.total;
        return total;
    }
}
