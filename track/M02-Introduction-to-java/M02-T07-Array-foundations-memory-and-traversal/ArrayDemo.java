
import java.util.Scanner;
class ArrayDemo{
    public static void main(String[] args){
        // print the array creation of size 5 assign values to using indexes and print using print statment
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 30;
        a[2] = 20;
        a[3] = 40;
        a[4] = 50;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

        // print the array intialization in single line and print values using print statements
        int[] b =  {100,200,300,400,500};
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);


        // Enhanced for loop 
        Scanner sc = new Scanner(System.in);
        int[] arr  = new int[5];
        System.out.println("Enter the array elements");
        for(int i =0; i<=4; i++){
            arr[i] = sc.nextInt();
        }
        // instead of hardcoded size of array use inbuilt array property arr.length
        System.out.println("Elements are :");
        for (int i =0; i<=arr.length-1 ;i++){
            System.out.println(arr[i]);
        }


        // for each loop for easy way to print
        // System.out.println("Elements are :");
        // for (int j: arr){
        //     System.out.println(j);
        // }

        // Print the array in reverse order
        System.out.println("Reverse order of elements are :");
        for(int i =arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }

        // copy array elements into the different array
        int j = 0;
        int[] arr1 = new int[arr.length];
        for(int i =0; i<=arr.length-1; i++){
            arr1[j] = arr[i];
            j++;
        }
        System.out.println("Copied array elements are :");
        for(j =0; j<=arr1.length-1; j++){
            System.out.println(arr1[j]);
        }

        // copy array elements in reverse order
        int k = 0;
        int[] arr2 = new int[arr.length];
        for(int i =arr.length-1; i>=0; i--){
            arr2[k] = arr[i];
            k++;
        }
        System.out.println("Copied array elements in reverse order are :");
        for(k =0; k<=arr2.length-1; k++){
            System.out.println(arr2[k]);
        }
        sc.close();
    }
}