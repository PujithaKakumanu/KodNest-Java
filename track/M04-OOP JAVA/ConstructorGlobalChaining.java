// consturctor chaining ----->Global constructors chaining (GCC) Using Super();
// Super(); used to call parent constructors (glbal constructors)
// super(); must be the first statement in the child constructor
// We cannot use this() and super() in the same constructor
// If don't provide super() it called automatically default constructor --->implicit call (not write in code )
//  explicit call ------> super(parameters) 


class Parent {

    Parent() {
        System.out.println("Inside Parent Zero Parameterized Constructor");
    }

    Parent(int x) {
        System.out.println("Inside Parent One Parameterized Constructor");
    }

    Parent(int x, int y) {
        System.out.println("Inside Parent Two Parameterized Constructor");
    }
}

class Child extends Parent {

    Child() {

        System.out.println("Inside Child Zero Parameterized Constructor");
    }

    Child(int x) {

        System.out.println("Inside Child One Parameterized Constructor");
    }

    Child(int x, int y) {

        System.out.println("Inside Child Two Parameterized Constructor");
    }

    Child(int x, int y, int z) {
        System.out.println("Inside Child Three Parameterized Constructor");
    }

}

public class ConstructorGlobalChaining {

    public static void main(String[] args) {
        Child c1 = new Child();

    }

}
