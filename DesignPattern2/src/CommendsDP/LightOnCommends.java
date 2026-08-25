
package CommendsDP;

public class LightOnCommends implements Commends{
    private Light light;
    public LightOnCommends(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        System.out.println("Light ON");
        light.lighton();
    }
    
}
