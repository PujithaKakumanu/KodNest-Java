
import java.util.Scanner;

public class AddNewElementToExistArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();

        }
        int arr2[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }
        int value = sc.nextInt();
        arr2[n] = value;

        for (int i = 0; i < n + 1; i++) {
            System.out.print(arr2[i] + " ");
        }

    }

}
