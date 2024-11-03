package entity;

public class ShoppingPayment extends RRPaymentServices{
    private static int counter;
    private String paymentID;
    public ShoppingPayment(double balance, int customerID) {
        super(balance, customerID);
    }
    public String getPaymentID() {
        return paymentID;
    }
    
}
