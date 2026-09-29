
// identify the objects in the real world 
// classify them based on the property and behavior
// identify the most important propertie and behavior of objects makes them useful to solve real world problems
// protect the important properties and behaviores useing private access specifier(private and protected)
// if  I can't control the important property every one access and modify at any time
// we can't direct access private and protected properties
// we can access private and protected properties using public methods(getter and setter)
class Book {

    private int pageNumber;

    public void setData(int x) {
        pageNumber = x;
    }

    public void getData() {
        System.out.println(pageNumber);
    }

}

public class WhyObjDataNeedProtection {

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setData(5);
        b1.getData();
    }
}
