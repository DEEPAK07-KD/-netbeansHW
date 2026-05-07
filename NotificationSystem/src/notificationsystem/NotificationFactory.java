package notificationsystem;

public class NotificationFactory {
        Notification send(String type)
        {
            switch(type)
            {
                case "emailnotification":
                {
                    return new EmailNotiification();
                }
                case "smsnotification":
                {
                    return new SMSNotification();
                }
                case "pushnotification":
                {
                    return new PushNotification();
                }
            }
            return  null;
        }
}
