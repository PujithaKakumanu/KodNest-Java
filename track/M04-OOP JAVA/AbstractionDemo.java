// Abstraction means  hiding the internal working and showing only the features of the object
// incomplete  methods are declared in the class using abstract keyword
// and the methods are implemented in the subclass 
// abstract class can have abstract methods ---> without the body 
// and concrete methods ---> having the body
// abstract class can have fields


// Rules:
// 1 Inside abstract class we can write --->  both abstract methods ,concrete methods
// 2 Inside abstrac class we can write  --->  only concrete methods 
// 3 if there is one abstract method is present inside the class make the class as abstract
// 4 we cannot create objects for abstract class
// 5 we can possible to create reference variable for abstract class
// 6  if we didn't provide body for the abstrct method inside the subclass then just make subclass as abstract   ---> we have to provide




abstract class Parent{
    abstract void display1();
    abstract void display2();
}
class Child1  extends Parent{
    
    @Override
    void display1() {
        System.out.println("Inside child1 class display1 method");
    }
    @Override
    void display2() {
        System.out.println("Inside child1 class display2 method");
    }
}
class Child2 extends Parent{

    @Override
    void display1() {
        System.out.println("Inside child2 class display1 method");
    }
    @Override
    void display2() {
        System.out.println("Inside child2 class display2 method");
    }
}
abstract class AbstractionDemo {
    public static void main(String[] args) {
        
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        accessMethod(c1);
        accessMethod(c2);
       
    }
    static void accessMethod(Parent p){
        p.display1();
        p.display2();
    }
}
