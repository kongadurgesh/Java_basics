package entity;

public class ContractEmployee extends Employee {
    private double wages;
    private int hours;

    public ContractEmployee(int empId, String name, double wages, int hours) {
        super(empId, name);
        this.wages = wages;
        this.hours = hours;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void calculateSalary() {
        super.setSalary(getHours() * getWages());
    }
}
