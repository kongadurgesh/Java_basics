package entity;

public class CreditCardPayment extends RRPaymentServices {

    private static int counter = 1001;
    private String paymentID;
    private double cashBack;
    private double balanceDue;

    public CreditCardPayment(double balance, int customerID) {
        super(balance, customerID);
    }

    public String getPaymentID() {
        return paymentID;
    }

    public double getCashBack() {
        return cashBack;
    }

    public double getBalanceDue() {
        return balanceDue;
    }

    @Override
    public void payBill(double amount) {
        double balance = getBalance();
        if (amount < balance && amount != 0d) {
            paymentID = "C" + counter++;
            System.out.println("Congratulations!! You have successfully made a payment of Rs." + amount
                    + ". Payment details are:");
            System.out.println("**********************************************************************************");
            System.out.println("Customer ID : " + getCustomerID());
            System.out.println("Payment ID: " + getPaymentID());
            System.out.println("Previous Due: " + getBalance());
            setBalance(balance - amount);
            System.out.println("Remaining Due: " + getBalance());
        } else {
            paymentID = "C" + counter++;
            System.out.println("Congratulations!! You have successfully made a payment of Rs." + amount
                    + ". Payment details are:");
            System.out.println("**********************************************************************************");
            System.out.println("Customer ID : " + getCustomerID());
            System.out.println("Payment ID: " + getPaymentID());
            System.out.println("Previous Due: " + getBalance());
            if (amount > balance) {
                setBalance(0);
                cashBack = Math.abs(balance - amount);
            }
            System.out.println("Remaining Due: " + getBalance());
            System.out.println("Cashback wallet Balance : " + getCashBack());
        }
    }

}
