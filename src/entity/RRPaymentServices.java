package entity;

public abstract class RRPaymentServices {
    private double balance;
    private int customerID;
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getCustomerID() {
        return customerID;
    }
    public RRPaymentServices(double balance, int customerID) {
        this.balance = balance;
        this.customerID = customerID;
    }
    public abstract void payBill(double amount);
}
