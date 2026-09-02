
import java.util.Scanner;

class Printer {

    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String word) {
        System.out.println("Word: " + word);
    }
}

public class OverLoadedMethods {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        String word = s.next();

        Printer p = new Printer();

        p.show(number);
        p.show(word);
    }

}
