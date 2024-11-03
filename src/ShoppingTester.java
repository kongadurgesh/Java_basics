import entity.CreditCardPayment;
import entity.RRPaymentServices;
import entity.ShoppingPayment;

public class ShoppingTester {
    public static void main(String[] args) {
        RRPaymentServices payment1 = new CreditCardPayment(10000.23, 5001);
        payment1.payBill(15000.0);

        RRPaymentServices payment2 = new CreditCardPayment(10000.23, 5001);
        payment2.payBill(0);

        RRPaymentServices payment3 = new ShoppingPayment(5000, 561328);
        payment3.payBill(5000);

        RRPaymentServices payment4 = new ShoppingPayment(5000, 561328);
        payment4.payBill(4000);
    }
}
