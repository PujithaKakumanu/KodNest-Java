// final on variables ---> To create constant variables(value cannot be changed)
// final on methods ---> To prevent method overriding(method cannot be overriden)
// final on classes ---> To prevent class inheritance(class cannot be inherited)


class A{
    final void show(){
        System.out.println("Show Method");
    }
}
class B extends A{
    void show(){
        System.out.println("Show Method");
    }
}
class FinalVariablesMethodsClasses {
    final int x = 10;
    public static void main(String[] args) {
        
        x = 20;
        System.out.println(x);
    }
}   