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
public class Main {
    public static void main(String[] args) {
        Payment pay1 = new Payment();
        
        pay1.titlePurchase(1);
        System.out.println("Credit Balance : " + pay1.CreditBalance);
        System.out.println("Emoney Balance : " + pay1.EmoneyBalance);
        System.out.println("Cash Balance : " + pay1.CashBalance);
        System.out.println("========================================");
        System.out.println("Total Payment : " + pay1.total);
        System.out.println("========================================");
        System.out.println("Payment with Credit, Ending Balance : "+ pay1.creditProses());
        System.out.println("Payment with Emoney, Ending Balance : "+ pay1.emoneyProses());
        System.out.println("Payment with Cash, Ending Balance : "+ pay1.cashProses());
    }
}
