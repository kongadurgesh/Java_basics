package entity;

public class PremiumUser extends User{

    private int rewardPoints;

    

    public PremiumUser(int id, String userName, String emailId, double walletBalance) {
        super(id, userName, emailId, walletBalance);
    }



    @Override
    public boolean makePayment1(double billAmount) {
        boolean isPaymentSuccessful = super.makePayment1(billAmount);

        if (isPaymentSuccessful) {
            setRewardPoints(getRewardPoints()+(int)(billAmount*0.1));
        }
        return isPaymentSuccessful;
    }
    

    @Override
    public void makePayment(double billAmount) {
        if(makePayment1(billAmount)){
            System.out.println("Congratulations"+getUserName()+", payment of $"+ billAmount +" was successful!");
        }
        else{
            System.out.println("Sorry "+getUserName()+", you do not have enough balance to pay the bill!");
        }
        System.out.println("Your wallet balance is $"+getWalletBalance());
        System.out.println("You have "+getRewardPoints()+" points");
    }



    public int getRewardPoints() {
        return rewardPoints;
    }



    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }  

}
