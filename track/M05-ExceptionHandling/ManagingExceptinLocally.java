import java.util.Scanner;
public class ManagingExceptinLocally {
    public static void main(String args[]){
        System.out.println("Main Method Excecution Started...");
        divide();
        System.out.println("Main method Excecution completed...");
    }
    static void divide(){
        try{
            System.out.println("Division started..");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            int res = a/b;
            System.out.println(res);
        } catch(Exception e){
            System.out.println("Exception Handeled in divide Method..");
        }
        System.out.println("Division completed...");
    }

    
}
