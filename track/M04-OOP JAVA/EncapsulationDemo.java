
class Book {

    private int pageNumber; // member variable or instance variable

    public void setData(int x) { // member method/function/or instance method
        if (x > 0) {
            pageNumber = x;
        } else {
            System.out.println("invalid pageNumber");
        }
    }

    public int getData() { // member method/function/or instance method

        return pageNumber;
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setData(10);
        System.out.println(b1.getData());
    }
}
