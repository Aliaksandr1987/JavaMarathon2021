package day13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        User Bob = new User("Bob");
        User Tom = new User("Tom");
        User Sam = new User("Sam");
        Bob.sendMessage(Tom,"Hello");
        Tom.sendMessage(Bob,"Hi");
        Bob.sendMessage(Tom, "How are you?");
        Tom.sendMessage(Bob,"Good");
        Tom.sendMessage(Bob,"How are you, Bob?");
        Sam.sendMessage(Bob,"Whats app");
        Bob.sendMessage(Sam,"Hi");
        Sam.sendMessage(Bob,"Did you see Tom?");
        Bob.sendMessage(Sam,"Yes");
        Sam.sendMessage(Bob,"Did he ask about me?");
        Bob.sendMessage(Sam,"No");
        Sam.sendMessage(Bob,"Good");
        MessageDatabase.showDialog(Bob,Sam);


    }
}
class User{
    private String username;
    private List<User> subscriptions;

    private List<User> friends;
    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
        this.friends = new ArrayList<>();
    }
    public String getUsername() {
        return username;
    }
    public List<User> getSubscriptions() {
        return subscriptions;
    }
    public List<User> getFriends() {
        return friends;
    }
    public void subscribe(User user){

        this.subscriptions.add(user);
    }
    public boolean isSubscribed(User user){
        for (User timeUser:this.subscriptions){
            if (timeUser.getUsername().equals(user.getUsername())){
            return true;
        }}
        return false;
    }
    public boolean isFriend(User user){
        for (User friendUser:this.friends){
        if (friendUser.getUsername().equals(user.getUsername())){
            return true;
        }}
        return false;
    }
    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this,user,text);
    }
    public String toString(){
        return "User{" +
                "username='" + username + '\'' + '}';
    }
}
class Massage {
    private User sender;
    private User receiver;
    private String text;
    private Date date;
    public Massage(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        Date date = new Date(); // Почему то не срабатывает
    }
    public User getSender() {
        return sender;
    }
    public User getReceiver() {
        return receiver;
    }
    public String getText() {
        return text;
    }
    public Date getDate() {
        return date;
    }
    public String toString(){
        return "\nFORM: "+ sender.getUsername()  + "\nTO: " + receiver.getUsername() + " \nON: " + getDate() + "\n" + this.text;
    }
}
class MessageDatabase{
    private static List<Massage> massage = new ArrayList<>();
    public static void addNewMessage(User u1, User u2, String text){
        Massage newMassage = new Massage(u1,u2,text);
        massage.add(newMassage);
    }
    public static List<Massage> getMessages(){
        return massage;
    }
    public static void showDialog(User u1, User u2){
        for (Massage massage:getMessages()) {
            if (massage.getSender()==u1 && massage.getReceiver()==u2){
            System.out.println(u1.getUsername() + ": "+massage.getText());}
            if (massage.getSender()==u2 && massage.getReceiver() ==u1)
            {System.out.println(u2.getUsername() + ": "+massage.getText());}
        }
    }
}
