import java.util.Scanner;

public class CalculateDistance {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int speed = inp.nextInt();
        int time = inp.nextInt();
        double timeInHours = (double) time / 60;
        double distance = speed * timeInHours;
        System.out.println(distance);

        inp.close();
    }
}
