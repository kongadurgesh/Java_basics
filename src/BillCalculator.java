import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int billId = inp.nextInt();
        int customerId = inp.nextInt();
        int discount = inp.nextInt();
        double billAmount = inp.nextDouble();
        double discountedBillAmount = billAmount - (billAmount * discount) / 100;
        System.out.println(
                "Customer Id: " + customerId + ", Bill Id: " + billId + ", " + "Total Bill: " + discountedBillAmount);

        inp.close();
    }
}
