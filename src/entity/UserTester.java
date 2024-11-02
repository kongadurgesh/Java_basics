package entity;

public class UserTester {
    public static void main(String[] args) {
        User user1 = new User(101, "Joe", "joe@abc.com", 100);
        user1.makePayment(70);
        
        User user2 = new PremiumUser(201, "Jill", "jill@abc.com", 300);
        user2.makePayment(150);
        user2.makePayment(80);
        user2.makePayment(120);
    }
}