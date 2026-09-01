import java.util.Scanner;

class Student {
    // Declare id, name and javascore
    int id;
    String name;
    int javascore;
}

public class CreateAndCompareTwoObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate the first Student object
        Student s1 = new Student();
        s1.id = scanner.nextInt();
        s1.name = scanner.next();
        s1. javascore = scanner.nextInt();

        // Create and populate the second Student object
        Student s2 = new Student();
        s2.id = scanner.nextInt();
        s2.name = scanner.next();
        s2. javascore = scanner.nextInt();

        // Display both records
        System.out.println(s1.id+" - "+s1.name+" - "+s1. javascore);
        System.out.println(s2.id+" - "+s2.name+" - "+s2. javascore);

        // Compare both scores and print one result
        if(s1.javascore > s2.javascore){
            System.out.println(s1.name+" has the higher Java score.");
        } else if(s1. javascore < s2. javascore) {
            System.out.println(s2.name + " has the higher Java score.");
        } else{
            System.out.println("Both students have the same Java score.");
        }
        scanner.close();
    }
}
