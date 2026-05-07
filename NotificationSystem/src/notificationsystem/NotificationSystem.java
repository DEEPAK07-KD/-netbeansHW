package notificationsystem;

public class NotificationSystem {

    public static void main(String[] args) {
        NotificationFactory nf=new NotificationFactory();
        Notification n=nf.send("emailnotification");
        n.sendMessage();
        Notification n2=nf.send("smsnotification");
        n2.sendMessage();
        Notification n3=nf.send("pushnotification");
        n3.sendMessage();
    }
    
}
