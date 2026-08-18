class student 
{
    String name;
    int age;
    double height;
    void input(String name, int age, double height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    void display()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
public class MethodDemo{
    public static void main(String[] args) {
        student s1 = new student();
        s1.input("Raja",18,5.5);
        s1.display();
    }
}