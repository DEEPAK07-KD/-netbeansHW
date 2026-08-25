package ChainOfResponsibility;

public class LoanOfficer extends Handler{

    @Override
    public void approveLoan(String custname,double amount) {
        if (amount <= 50000) {
            System.out.println("Loan Approved");
            System.out.println("");
            System.out.println("Customer Name : "+custname);
            System.out.println("Approved By : Loan Officer");
            System.out.println("Loan Amount : "+amount);
        }
        else if (hand != null) {
            hand.approveLoan(custname,amount);
        }
    }
    
}
