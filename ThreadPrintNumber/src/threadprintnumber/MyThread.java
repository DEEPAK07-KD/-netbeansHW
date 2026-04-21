package threadprintnumber;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
        for (int i = 1; i <= 5; i++) {
            
            int a=i;
            System.out.println(a);
             Thread.sleep(1000);
        }
        
            
           
        } catch (InterruptedException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
}
