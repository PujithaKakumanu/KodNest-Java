import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the byte Value:");
        byte a = sc.nextByte();
        System.out.println("byte Value is: "+a);

        System.out.println("Enter the short value: ");
        short b = sc.nextShort();
        System.out.println("short value is: "+b);
        
        System.out.println("Enter the integer value: ");
        int c = sc.nextInt();
        System.out.println("integer value is: "+c);

        System.out.println("Enter the long value: ");
        long d = sc.nextLong();
        System.out.println("long value is :"+d);

        System.out.println("Enter the float value:");
        float e = sc.nextFloat();
        System.out.println("float value is "+e);

        System.out.println("Enter the double value:");
        double f = sc.nextDouble();
        System.out.println("double value is "+f);

        System.out.println("Enter the boolean value:");
        boolean g = sc.nextBoolean();
        System.out.println("boolean value is "+g);

        sc.close();
    }
}
