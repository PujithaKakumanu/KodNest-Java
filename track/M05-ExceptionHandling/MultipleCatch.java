import java.util.Scanner;
import java.util.*;


public class MultipleCatch {
    public static void main(String[] args){
        try{
            System.out.println("Connection Established....");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Value of a: ");
            int a = sc.nextInt();
            System.out.println("Enter Value of b: ");
            int b = sc.nextInt();
            System.out.println("result: "+a/b);

            System.out.println("Enter array size:     ");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("enter the index to be inserted: ");
            int index = sc.nextInt();
            System.out.println("Enter the array value: ");
            int value = sc.nextInt();
            arr[index] = value;
            System.out.println("Value stored.");
        }
        catch(ArithmeticException e1){
            //System.out.println(e1.getMessage());
            e1.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println(e2.getMessage());
        }
        catch(InputMismatchException e3){
            System.out.println(e3.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage()); // Generic Exception(Genarally used exception it handled the all the types of exceptions)It is always write below of all the specific Exceptions
        }
        System.out.println("Connection Terminated...");

    }
}
