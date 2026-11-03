class College {

    int pageNumber;

    void setData(int x) {
        pageNumber = x;
    }

    void getData() {
        System.out.println(pageNumber);
    }

}

public class NameClashofClassVariables {
    public static void main(String[] args) {
        College c1 = new College();
        c1.setData(5);
        c1.getData();

    }
}
