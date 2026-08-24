
package StrategyDP;


public class NetBankingPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + "Processed Through NetBanking.");
    }
}
