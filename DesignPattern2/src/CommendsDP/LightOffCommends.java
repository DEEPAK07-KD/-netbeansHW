
package CommendsDP;

public class LightOffCommends implements Commends{
    private Light light;
    public LightOffCommends(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        System.out.println("Light OFF");
        light.lightoff();
    }
}
