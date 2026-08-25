
package ChainOfResponsibility;

public class BranchManager extends Handler{

    @Override
     public void approveLoan(String custname,double amount) {
        if (amount > 50001 && amount <= 500000) {
            System.out.println("Loan Approved");
            System.out.println("");
            System.out.println("Customer Name : "+custname);
            System.out.println("Approved By : Branch Manager");
            System.out.println("Loan Amount : "+amount);
        }
        else if (hand != null) {
            hand.approveLoan(custname,amount);
        }
    }
    
}
