package entity;

public class User {
    private int id;
    private String userName;
    private String emailId;
    private double walletBalance;
    public User(int id, String userName, String emailId, double walletBalance) {
        this.id = id;
        this.userName = userName;
        this.emailId = emailId;
        this.walletBalance = walletBalance;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public double getWalletBalance() {
        return walletBalance;
    }
    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public boolean makePayment1(double billAmount){
        if(getWalletBalance()<billAmount)
            return false;
        else
            setWalletBalance(getWalletBalance()-billAmount);
        return true;
    }

    public void makePayment(double billAmount){
        if(makePayment1(billAmount)){
            System.out.println("Congratulations"+getUserName()+", payment of $"+ billAmount +" was successful!");
        }
        else{
            System.out.println("Sorry "+getUserName()+", you do not have enough balance to pay the bill!");
        }
        System.out.println("Your wallet balance is $"+getWalletBalance());
    }
}
