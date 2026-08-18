
import java.util.Scanner;
class ArrayDemo{
    public static void main(String[] args){
        // Array is a non-primitive data type
        // Array is a Static data type
        // Array size is fixed at the time of creation
        // Array is a non-linaer Data structure
        // Array is a user defiend data type
        // Array is a collection of same data type
        // Array is a collection of elements of same data type stored in contigous memory location
        // Array is a fixed size collection of elements of same data type stored in contigous memory location
        // Arrays are used to overcome the limitation of primitive variables 
        // array is nothing but group of variables of same type
        
        // syntax of array declaration and creation: datatype[] arrayName = new datatype[size];
        // syntax of array intialization: datatype[] arrayName = {value1, value2, value3, value4, value5};
        // Array can be declared in three ways:datatype[] arrayName; datatype[] arrayName[]; datatype []arrayName;
        // Array can be created in three ways:datatype[] arrayName = new datatype[size];
        // Array can be intialized in three ways:datatype[] arrayName = {value1, value2, value3, value4, value5};
        
        // Advantages of array
        // 1. Random access of elements
        // 2. Cache friendly
        // 3. Better memory locality
        // 4. Easy to implement algorithms
        // 5. Easy to search elements
        // 6. Easy to sort elements
        // 7. Easy to reverse elements
        // 8. Easy to copy elements
        // 9. Easy to delete elements
        // 10. Easy to insert elements
        // 11. Easy to traverse elements
        // 12. Easy to print elements
        // 13. Easy to search elements
        // 14. Easy to sort elements
        // 15. Easy to reverse elements
        // 16. Easy to copy elements
        // 17. Easy to delete elements
        // 18. Easy to insert elements
        // 19. Easy to traverse elements
        // 20. Easy to print elements

        // Disadvantages of array
        // 1. Fixed size

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
        try (Scanner sc = new Scanner(System.in)) {
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
        }
    }
}