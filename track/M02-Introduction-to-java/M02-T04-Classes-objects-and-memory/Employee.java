class Employee{
    int id;
    String name;
    
    void work()
    {
        System.out.println("Working");
    } 
}

class Main{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "John";
        e1.work();
        Employee e2;
        e2 = e1;
        e2.id = 15;
        e2.name = "Dev";
        e2.work();
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);
        
    }   
}