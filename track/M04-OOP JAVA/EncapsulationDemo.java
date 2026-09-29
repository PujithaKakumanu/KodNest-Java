
class Book {

    private int pageNumber;

    public void setData(int x) {
        if (x > 0) {
            pageNumber = x;
        } else {
            System.out.println("invalid pageNumber");
        }
    }

    public int getData() {
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
