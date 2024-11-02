package entity;

import java.util.Arrays;

public class Registration {
    private String customerName;
    private String panCardNo;
    private int voterId;
    private String passportNo;
    private int liscenseNo;
    private long[] telephoneNo;
    public String getCustomerName() {
        return customerName;
    }
    public String getPanCardNo() {
        return panCardNo;
    }
    public int getVoterId() {
        return voterId;
    }
    public String getPassportNo() {
        return passportNo;
    }
    public int getLiscenseNo() {
        return liscenseNo;
    }
    public long[] getTelephoneNo() {
        return telephoneNo;
    }
    @Override
    public String toString() {
        return "Registration [customerName=" + customerName + ", panCardNo=" + panCardNo + ", voterId=" + voterId
                + ", passportNo=" + passportNo + ", liscenseNo=" + liscenseNo + ", telephoneNo="
                + Arrays.toString(telephoneNo) + "]";
    }
    public Registration(String customerName, String passportNo, long[] telephoneNo) {
        this.customerName = customerName;
        this.passportNo = passportNo;
        this.telephoneNo = telephoneNo;
    }
    public Registration(String customerName,  int liscenseNo, String panCardNo, long[] telephoneNo) {
        this.customerName = customerName;
        this.panCardNo = panCardNo;
        this.liscenseNo = liscenseNo;
        this.telephoneNo = telephoneNo;
    }
    public Registration(String customerName, int voterId, int liscenseNo, long[] telephoneNo) {
        this.customerName = customerName;
        this.voterId = voterId;
        this.liscenseNo = liscenseNo;
        this.telephoneNo = telephoneNo;
    }
    public Registration(String customerName, String panCardNo, int voterId, long[] telephoneNo) {
        this.customerName = customerName;
        this.panCardNo = panCardNo;
        this.voterId = voterId;
        this.telephoneNo = telephoneNo;
    }

    public static void main(String[] args) {
        Registration r1 = new Registration("Kevin", "MN9891N", new long[]{9452425421l,7676765252l });
        System.out.println("Congratualtions "+r1.getCustomerName()+" you have been successfully registered for our services with the following details:");
        System.out.println("Passport Number: "+r1.getPassportNo());
        System.out.print("Phone Numbers: ");
        for (long number : r1.getTelephoneNo()) {
            System.out.println(number);
        }

        Registration r2 = new Registration("Julias", 123, "PN7878", new long[]{2345615451l, 6763562562l});
        System.out.println("Congratulations "+r2.getCustomerName()+" you have been successfully registered for our services with the following details:");
        System.out.println("liscense Number: "+r2.getPassportNo());
        System.out.println("Pan card number: "+r2.getPanCardNo());
        System.out.print("Phone Numbers: ");
        for (long number : r2.getTelephoneNo()) {
            System.out.println(number);
        }
    }
}
