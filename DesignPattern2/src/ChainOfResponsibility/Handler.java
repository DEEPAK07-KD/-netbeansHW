
package ChainOfResponsibility;

abstract class Handler {
    protected Handler hand;
    
    public void  next(Handler hand){
        this.hand=hand;
    }
    public abstract void approveLoan(String custname, double amount);
}
