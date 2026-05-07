package notificationsystem;

public class EmailNotiification  implements Notification{

    @Override
    public void sendMessage() {
        System.out.println("SENDING EMAIL NOTIFICATION");
    }
        
}
