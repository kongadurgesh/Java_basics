package entity;

public class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private int experience;

    public PermanentEmployee(int empId, String name, double basicPay, double hra, int experience) {
        super(empId, name);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
        calculateSalary();
    }

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void calculateSalary() {
        if (getExperience() < 3) {
            super.setSalary(getBasicPay() + getHra());
        } else if (getExperience() >= 3 && getExperience() < 5) {
            super.setSalary(getBasicPay() * 1.05 + getHra());
        } else if (getExperience() >= 5 && getExperience() < 10) {
            super.setSalary(getBasicPay() * 1.07 + getHra());
        } else if (getExperience() >= 10) {
            super.setSalary(getBasicPay() * 1.12 + getHra());
        }
    }
}
