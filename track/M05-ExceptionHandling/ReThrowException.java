import java.util.Scanner;
public class ReThrowException {
    public static void main(String args[]){
        System.out.println("Main Method Excecution Started...");
        try{
            divide();
        }catch(Exception e){
            System.out.println("Exception Handeled in main Method..");
        }
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
            throw e;
        }
        finally{
            System.out.println("Division completed...");
        }
    }

}
