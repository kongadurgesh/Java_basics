import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();

        int whileReverse = getWhileReverse(num);
        int forReverse = getForReverse(num);
        int doWhileReverse = getDoWhileReverse(num);

        System.out.println("whileReverse: " + whileReverse);
        System.out.println("forReverse: " + forReverse);
        System.out.println("doWhileReverse: " + doWhileReverse);
        inp.close();
    }

    private static int getDoWhileReverse(int num) {
        int rev = 0;
        do {
            rev = rev * 10 + (num % 10);
            num /= 10;
        } while (num > 0);
        return rev;
    }

    private static int getForReverse(int num) {
        int rev = 0;
        for (int temp = num; temp > 0; temp /= 10) {
            rev = rev * 10 + (temp) % 10;
        }
        return rev;
    }

    private static int getWhileReverse(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
}
