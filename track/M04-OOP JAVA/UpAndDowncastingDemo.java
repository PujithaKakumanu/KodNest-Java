
class Parent{
    void show1(){
        System.out.println("Inside Parent class method-1");
    }
}
class Child1 extends Parent{
    void show2(){
        System.out.println("Inside Child class method-2");
    }
    @Override
    void show1(){
        System.out.println("Inside Child class method-1");
    }
}

class Child2 extends Parent{
    void show3(){
        System.out.println("Inside Child2 class method-3");
    }
    @Override
    void show1(){
        System.out.println("Inside Child2 class method-1");
    }
}


public class UpAndDowncastingDemo {
    public static void main(String[] args) {
        //Parent p = new Child(); // upcasting ------> child class object referred by parent class refernce
        Child1 ch1 = new Child1();
        accessMethod(ch1);

        Child2 ch2 = new Child2();
        accressMethod(ch2);
       // p.show1();
        ((Child)p).show2(); // downcasting ------> parent class object referred by child class refernce

        
    }
    public static void accessMethod(Parent p){
        p.show1();
        if(p instanceof Child1){
            ((Child1)p).show2();
        }
        if(p instanceof Child2){
            ((Child2)p).show3();
        }
    }
    
}
