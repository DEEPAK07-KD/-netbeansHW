package StrategyDP;

public class UPIPayment  implements PaymentStrategy{

    @Override
    public void pay(double amount) {
         System.out.println("Payment of ₹" + amount + "Processed Through UPI.");
    }
    
}
