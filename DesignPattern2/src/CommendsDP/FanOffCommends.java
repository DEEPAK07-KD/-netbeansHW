
package CommendsDP;

public class FanOffCommends implements Commends{
      private Fan fan;
    public FanOffCommends(Fan fan){
        this.fan=fan;
    }
    @Override
    public void execute() {
        System.out.println("Fan Is Turned OFF");
        fan.fanOff();
    }
}
