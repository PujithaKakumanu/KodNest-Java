// class is a blueprint or template for creating objects
// class is a user-defined data type
// class contains data members and member functions
// object is an instance of a class
// object is stored in heap memory
// object is of no use unless it is assigned to a reference variable




class Student{

    int roll;
    String name;
    double height;

    void run() {
        System.out.println("Running");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

public class ClassObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 101;
        s1.name = "Priya";
        s1.height = 5.3;
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleep();
        Student s2 = new Student();
        s2.roll = 102;
        s2.name = "Khushi";
        s2.height = 5.5;
        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.height);
        s1.run();
        s1.sleep();
    }
}


