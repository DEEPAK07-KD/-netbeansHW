
package CommendsDP;


public class FanOnCommends implements Commends{
    private Fan fan;
    public FanOnCommends(Fan fan){
        this.fan=fan;
    }
    @Override
    public void execute() {
        System.out.println("Fan Is Turned ON");
        fan.fanOn();
    }
}
