public class EmployeeRecord {
    public static void main(String[] args) {
        double salary[] = new double[] { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double averageSalary = 0d;
        for (double d : salary) {
            averageSalary += d;
        }
        averageSalary /= salary.length;
        int countMore = 0;
        int countLess = 0;

        for (double d : salary) {
            if (d < averageSalary)
                countLess++;
            else
                countMore++;
        }
        System.out.println("The average salary of the employee is :" + averageSalary);
        System.out.println("The number of employees having salary greater than the average is :" + countMore);
        System.out.println("The number of employees having salary lesser than the average is :" + countLess);
    }
}
