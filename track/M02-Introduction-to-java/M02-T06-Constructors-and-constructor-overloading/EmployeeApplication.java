class Employee {
    String name;
    int id;
    double salary;
    String role;

    Employee(String name, int id, double salary, String role){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.role = role;
    }
    Employee(String name, int id, double salary){
        this(name, id, salary, "Employee");
    }
    Employee(String name, int id, String role){
        this(name, id, 0, role);
    }
    Employee(String name, int id){
        this(name, id, 0, "Employee");
    }

    
    void display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Role: " + role);
    }
}

public class EmployeeApplication{
    public static void main(String[] args){
        Employee e1 = new Employee("John", 101, 10000, "Software Engineer");
        e1.display();
        Employee e2 = new Employee("Jane", 102, 20000, "HR");
        e2.display();
        Employee e3 = new Employee("Bob", 103, 30000);
        e3.display();
        Employee e4 = new Employee("Alice", 104, "Manager");
        e4.display();
        Employee e5 = new Employee("Tom", 105);
        e5.display();
    }
}
