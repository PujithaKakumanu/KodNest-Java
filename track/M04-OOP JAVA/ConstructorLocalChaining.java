// local chaining consturctor chaining using this();
// this() used to call same class constructors (local constructors)
// this() must be the first statement in the constructor
// We cannot use this() and super() in the same constructor
// If don't provide this() it called automatically default constructor --->implicit call (not write in code )
// explicit call ------> this(parameters) 


class Parent{
    Parent(){
        System.out.println("Inside Parent Zero Parameterized Constructor");
    }
    Parent(int x){
        this();
        System.out.println("Inside Parent One Parameterized Constructor");
    }
    Parent(int x,int y){
        this(x);
        System.out.println("Inside Parent Two Parameterized Constructor");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Inside Child Zero Parameterized Constructor");
    }
    Child(int x){
        this();
        System.out.println("Inside Child One Parameterized Constructor");
    }
    Child(int x,int y){
        this(x);
        System.out.println("Inside Child Two Parameterized Constructor");
    }
    Child(int x,int y,int z){
        this(x,y);
        System.out.println("Inside Child Three Parameterized Constructor");
    }
}


public class ConstructorLocalChaining {
    public static void main(String[] args) {
        Child c1 = new Child();
            
    }
    
}
