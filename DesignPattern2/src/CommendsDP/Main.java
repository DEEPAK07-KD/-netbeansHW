package CommendsDP;

public class Main {
    public static void main(String[] args) {
       Light light=new Light();
    Fan fan = new Fan();
    
    Commends lighton = new LightOnCommends(light);
    Commends lightoff = new LightOffCommends(light);
    
    Commends fanon = new FanOnCommends(fan);
    Commends fanoff = new FanOffCommends(fan);
    
    RemoteControl remote = new RemoteControl();
    
    remote.command(lighton);
    remote.pressbtn();
    
    remote.command(fanon);
    remote.pressbtn();
    
    remote.command(lightoff);
    remote.pressbtn();
    
    remote.command(fanoff);
    remote.pressbtn();
    }
    
    
}
