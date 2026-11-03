import java.util.Objects;

class Student{
    int roll;
    String name;
    Student(int roll,String name){
        this.roll = roll;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return roll == other.roll && Objects.equals(name, other.name);
    }
    
}
public class OverrideHashToStringMethod {
    public static void main(String[] args) {
        Student s1 = new Student(1, "John");
        Student s2 = new Student(1, "John");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.getClass());
        System.out.println(s2.getClass());
    }
    
}
