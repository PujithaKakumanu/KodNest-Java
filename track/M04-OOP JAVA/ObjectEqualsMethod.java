// In java equals() method is used to compare two objects of memory location.
// By default it compare the address of the two objects
// but in some case we can  override the equals() method to compare the values of the two objects In String class we can see that example


public class ObjectEqualsMethod extends Object{
    int roll;
    String name;
    ObjectEqualsMethod(int roll,String name){
        this.roll = roll;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        ObjectEqualsMethod o = (ObjectEqualsMethod) obj;
        if(this.roll == o.roll && this.name.equals(o.name));{
            return true;
        }
        else{
            return false;
        } 
        
    }
    void display(){
        System.out.println("Roll number : " + this.roll);
        System.out.println("Name : " + this.name);
    }
    
    public static void main(String[] args) {
        ObjectEqualsMethod obj1 = new ObjectEqualsMethod(1, "John");
        ObjectEqualsMethod obj2 = new ObjectEqualsMethod(2, "Doe");
        ObjectEqualsMethod obj3 = new ObjectEqualsMethod(1, "John");
        System.out.println(obj1.equals(obj2));   //false
        System.out.println(obj1.equals(obj3));   //false

        obj1.display();
        obj2.display();
        obj3.display();
    }
    
}
