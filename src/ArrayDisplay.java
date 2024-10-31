import java.util.Scanner;

public class ArrayDisplay {
    public static void main(String[] args) {
        int arr[] = new int[5];
        storeMarks(arr);
        display(arr);
    }

    private static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void storeMarks(int[] arr) {
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = inp.nextInt();
        }
        inp.close();
    }
}
