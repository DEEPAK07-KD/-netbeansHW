
package CommendsDP;

public class RemoteControl {
    private Commends commend;
    
    public void command(Commends commend){
        this.commend=commend;
    }
    
    public void pressbtn(){
        System.out.println("Remote Button Pressed");
        commend.execute();
        System.out.println();
    }
}
