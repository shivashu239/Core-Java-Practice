interface notifiable {
    void sendNotification(String message);
}
abstract class User{
    private String name;

    User(String name) {
        this.name = name;
    }
    public void getUser() {
        System.out.println("User name is = " + name);
    }
    public String getName() {
        return name;
    }
}
class EmailUser extends User implements notifiable {
    EmailUser(String name) {
        super(name);
    }
    public void sendNotification(String message){
        System.out.println("Email sent to " + getName() + " : " + message);
    }
}
class SMSUser extends User implements notifiable {
    SMSUser(String name) {
        super(name);
    }
    public void sendNotification(String message){
        System.out.println("Message sent to " + getName() + " : " + message);
    }
}
public class Notification {
    public static void main(String[] args) {
        EmailUser email = new EmailUser("Shivanshu");
        SMSUser sms = new SMSUser("Pulkit");
        
        email.getName();
        email.sendNotification("Your interview is scheduling soon");
        
        sms.getName();
        sms.sendNotification("Your Job applicatin is pending");
    }
}