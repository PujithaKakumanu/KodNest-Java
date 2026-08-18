
import java.util.Scanner;

public class SearchArrayElement {
    void search(int ref[], int target) {
        boolean found = false;
        for (int i = 0; i < ref.length; i++) {
            if (ref[i] == target) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found");
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        SearchArrayElement sae = new SearchArrayElement();
        sae.search(arr, target);
    }
}

