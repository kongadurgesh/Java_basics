package entity;

public class Loan {
    private static int loanCounter;
    private int loanNo;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private int loanDuration;
    private float interest;

    public int getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(int loanNo) {
        this.loanNo = loanNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }

    public float getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public Loan() {
        loanCounter++;
    }

    public Loan(int loanNo, int accountNo, int customerNo, float loanAmount, int loanDuration, float interest) {
        this.loanNo = loanNo;
        this.accountNo = accountNo;
        this.customerNo = customerNo;
        this.loanAmount = loanAmount;
        this.loanDuration = loanDuration;
        this.interest = interest;
        loanCounter++;
    }

    @Override
    public String toString() {
        return "Loan [loanNo=" + loanNo + ", accountNo=" + accountNo + ", customerNo=" + customerNo + ", loanAmount="
                + loanAmount + ", loanDuration=" + loanDuration + ", interest=" + interest + "]";
    }

    public static void main(String[] args) {
        Loan loan1 = new Loan();
        Loan loan2 = new Loan(123, 345, 567, 789f, 3, 45f);
        System.out.println(Loan.loanCounter);
        System.out.println(loan1.toString());
        System.out.println(loan2.toString());
    }
}
