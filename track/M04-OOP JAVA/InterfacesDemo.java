interface Shape{
    public abstract void input();
    public abstract void display();
}
class Square implements Shape{
    public void input(){
        System.out.println("Inside square class input method");
    }
    public void display(){
        System.out.println("Inside square class display method");
    }
}
public class InterfacesDemo {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.input();
        sq.display();
    }
}   