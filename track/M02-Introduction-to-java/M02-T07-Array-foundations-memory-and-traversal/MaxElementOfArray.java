
import java.util.Scanner;
class MaxElementOfArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int maximum = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>maximum){
                maximum = arr[i];
            }
        }
        System.err.println("Maximum element of an array is: "+maximum);
        sc.close();
    }
}
