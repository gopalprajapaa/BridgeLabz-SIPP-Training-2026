class Notification{
    String recipientName;
    String message;

    Notification(String recipientName,String message)
    {
        this.recipientName=recipientName;
        this.message=message;
    }

    String  sendNotification(){
        return "message from parent class";
    }
}

class EmailNotification extends Notification{

     EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    String sendNotification(){
        return "message from EmailNotification";
    }
}


class SMSNotification extends Notification{

     SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    String sendNotification(){
        return "message from SMSNotification";
    }
    
}


class PushNotification extends Notification{

     PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    String sendNotification(){
        return "message from PushNotification";
    }
    
}







public class SmartNotificationSystem{

    public static void main(String args[])
    {
   Notification[] notifications={new EmailNotification( "Gopal",
                "Your interview is scheduled tomorrow."),
                new SMSNotification(
                "Rahul",
                "Your OTP is 458712."),
                new PushNotification(
                "Priya",
                "You have a new friend request.")};


                for(Notification notification:notifications)
                {
                    String temp=notification.sendNotification();
                    System.out.println(temp);
                }

    }

}