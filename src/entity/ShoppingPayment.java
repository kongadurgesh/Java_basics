package entity;

public class ShoppingPayment extends RRPaymentServices {
    private static int counter = 1001;
    private String paymentID;

    public ShoppingPayment(double balance, int customerID) {
        super(balance, customerID);
    }

    public String getPaymentID() {
        return paymentID;
    }

    @Override
    public void payBill(double amount) {
        double balance = getBalance();
        if (amount == balance) {
            setBalance(balance - amount);
            paymentID = "S" + counter++;
            generateReceipt(amount);
        } else {
            System.out.println("Insufficient amount entered!! Please try again.");
        }
    }

    private void generateReceipt(double amount) {
        System.out.println(
                "Congratulations!! Your payment of Rs." + amount + " is successful with payment id " + paymentID + ".");
    }
}
