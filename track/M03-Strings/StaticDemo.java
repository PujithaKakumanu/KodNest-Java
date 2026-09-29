
class Car {

    static void convertKmsToMiles() {
        System.out.println("Converting Kms to Miles...");
    }

    void calculatingMiles() {
        System.out.println("Calculating Miles...");
    }
}

public class StaticDemo {

    public static void main(String[] args) {
        Car.convertKmsToMiles();

        Car nano = new Car();
        nano.calculatingMiles();

        Car bmw = new Car();
        bmw.calculatingMiles();
    }
}
