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
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Role: " + role);
    }
}
class Main{
    public static void main(String[] args){
        Employee e1 = new Employee("John", 1, 1000, "Software Engineer");
        Employee e2 = new Employee("Jane", 2, 2000, "HR");
        e1.display();
        e2.display();
    }
}

