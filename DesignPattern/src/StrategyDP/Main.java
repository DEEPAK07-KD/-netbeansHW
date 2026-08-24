package StrategyDP;

public class Main {
    public static void main(String[] args) {
        Payment upi = new Payment(new UPIPayment());
        upi.makePaymentt(1000);
        
        Payment credit = new Payment(new CreditCardPayment());
        credit.makePaymentt(2000);
        
        Payment net = new Payment(new NetBankingPayment());
        net.makePaymentt(3000);
    }
}
