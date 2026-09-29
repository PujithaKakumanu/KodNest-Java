
public class CountTheCreatedObjects {

    static int count = 0;

    public CountTheCreatedObjects() {
        count++;
    }

    public static void main(String[] args) {
        CountTheCreatedObjects c1 = new CountTheCreatedObjects();
        CountTheCreatedObjects c2 = new CountTheCreatedObjects();
        CountTheCreatedObjects c3 = new CountTheCreatedObjects();

        System.out.println("No of Created objects: " + CountTheCreatedObjects.count);
    }
}

