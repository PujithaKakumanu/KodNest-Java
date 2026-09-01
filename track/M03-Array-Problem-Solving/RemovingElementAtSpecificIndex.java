
import java.util.Scanner;

public class RemovingElementAtSpecificIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        int arr2[] = new int[n - 1];
        for (int i = 0; i < index; i++) {
            arr2[i] = arr1[i];
        }
        for (int i = index; i < n - 1; i++) {
            arr2[i] = arr1[i + 1];
        }
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr2[i] + " ");
        }
        sc.close();
    }
}
