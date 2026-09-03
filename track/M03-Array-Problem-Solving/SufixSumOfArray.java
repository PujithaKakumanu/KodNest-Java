
import java.util.*;

public class SufixSumOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sufixSum = new int[arr.length];
        sufixSum[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            sufixSum[i] = sufixSum[i + 1] + arr[i];
        }
        System.out.println(Arrays.toString(sufixSum));
    }

}
