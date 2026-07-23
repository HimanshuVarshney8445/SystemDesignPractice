interface Notification{
    void send(String message);
}

class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sending Email Notification: " + message);
    }
}

class SMSNotification implements Notification{
    @Override
    public void send(String message){
        System.out.println("Sending SMS Notification: " + message);
    }
}

class PushNotification implements Notification{
    @Override
    public void send(String message){
        System.out.println("Sending Push Notification: " + message);
    }
}

class NotificationFactory{
    public static Notification createNotification(String type){
        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        } else if (type.equalsIgnoreCase("push")) {
            return new PushNotification();
        }
        return null;
    }
}

public class NotificationSystem{
    public static void main(String[] args) {
        // NotificationFactory factory = new NotificationFactory();

        Notification emailNotification = NotificationFactory.createNotification("email");
        emailNotification.send("Welcome!");

        Notification smsNotification = NotificationFactory.createNotification("sms");
        smsNotification.send("Welcome!");

        Notification pushNotification = NotificationFactory.createNotification("push");
        pushNotification.send("Welcome!");
    }
}