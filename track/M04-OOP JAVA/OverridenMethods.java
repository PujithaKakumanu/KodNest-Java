// In Java Inheritance:
// Parent class menthods are inhereted to child class Those menthods are called Inhereted menthods
// But in child class if we redefine menthod with same signature of parent class menthods Those menthods are called Overriden methods
// Overriden menthods are executed instead of Inhereted menthods when we called
// Implemented methods (methods inside the child class)is called the Specialized menthods

class Parent {
    void show1() {
        System.out.println("parent class method-1");
    }
    void show2(){
        System.out.println("parent class method-2");
    }
}

class Child extends Parent {
    @Override
    void show2(){
        System.out.println("child class method-2");
    }
    void show3() {
        System.out.println("child class method-3");
    }

}

public class OverridenMethods {
    public static void main(String[] args) {
        Child c = new Child();
        c.show1();
        c.show2();
        c.show3();
    }

}
