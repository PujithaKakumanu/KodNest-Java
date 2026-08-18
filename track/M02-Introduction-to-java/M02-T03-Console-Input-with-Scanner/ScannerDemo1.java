import java.util.Scanner;
class ScannerDemo1 {
    public static void main(String[] args) {
        // Scanner is used to get input from the user
        // syntax: Scanner scanner = new Scanner(System.in);
        // scanner.nextInt(); to get integer input
        // scanner.nextDouble(); to get double input
        // scanner.next(); to get string input
        // scanner.nextLine(); to get line input
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        double height = scanner.nextDouble();
        String name = scanner.next();
        String address = scanner.nextLine();
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);

        // There is problem in int nextInt() followed by nextLine()
        // nextInt() does not read the new line character 
        // so the nextLine() reads the new line character and returns empty string
        // to avoid this problem we can use scanner.nextLine() before scanner.nextInt()
        int number1 = scanner.nextInt();
        String name1 = scanner.nextLine();  
        System.out.println("Number: " + number1);
        System.out.println("Name: " + name1);

        System.out.println("Enter the age: ");
        int age1 = scanner.nextInt();
        System.out.println("age is: "+ age1);

        System.out.println("Enter your height:");
        float height1 = scanner.nextFloat();
        System.out.println("height is : " + height1);
        
        scanner.nextLine();
        System.out.println("enter the name : ");
        String name2 = scanner.nextLine();
        System.out.println("name is : " + name2);

        
        // close method is used to close the scanner
        scanner.close();

    }
}
