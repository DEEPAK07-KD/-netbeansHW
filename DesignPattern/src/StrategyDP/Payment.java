
package StrategyDP;


public class Payment {
    private PaymentStrategy stra;

    public Payment(PaymentStrategy stra) {
        this.stra = stra;
    }
    public void makePaymentt(double amount){
        stra.pay(amount);
    }
}
