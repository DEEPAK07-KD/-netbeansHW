
package ChainOfResponsibility;

public class RegionalManager extends Handler{

    @Override
    public void approveLoan(String custname,double amount) {
        if (amount > 50000) {
            System.out.println("Loan Approved");
            System.out.println("");
            System.out.println("Customer Name : "+custname);
            System.out.println("Approved By : Regional Manager");
            System.out.println("Loan Amount : "+amount);
        }
        else{
            System.out.println("Loan Rejected");
        }
    }
    
}
