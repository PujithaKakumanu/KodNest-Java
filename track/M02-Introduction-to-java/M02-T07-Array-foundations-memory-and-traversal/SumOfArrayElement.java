import java.util.Scanner;
class SumOfArrayElement  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter the array elements: ");
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Entered array elements are: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of array elements is: "+sum);
    sc.close();
    }
    
}
