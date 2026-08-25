package ChainOfResponsibility;

public class Main {
    
    public static void main(String[] args) {
        Handler loanofficer = new LoanOfficer();
        Handler branchmanager = new BranchManager();
        Handler regionalmanager = new RegionalManager();
        
        loanofficer.next(branchmanager);
        branchmanager.next(regionalmanager);
        
       
        
        loanofficer.approveLoan("Deepak",40000);
    }

}
