import entity.ContractEmployee;
import entity.Employee;
import entity.PermanentEmployee;

public class EmployeeRecords {
    public static void main(String[] args) {
        Employee e1 = new PermanentEmployee(101, "Anil", 10000, 1500, 3);
        System.out.println("Permanent Employee: Your salary is: "+e1.getSalary());

        Employee e2 = new ContractEmployee(102, "Ankit", 500, 10);
        System.out.println("Contract Employee: Your salary is: "+e2.getSalary());
    }
}
