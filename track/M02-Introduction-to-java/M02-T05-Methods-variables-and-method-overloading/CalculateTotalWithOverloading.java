
import java.util.Scanner;

class ResultCalculator {

    int getTotal(int first, int second) {
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        return first + second + third;
    }

}

public class CalculateTotalWithOverloading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        ResultCalculator rc = new ResultCalculator();
        int twoMarksTotal = rc.getTotal(first, second);
        int threeMarksTotal = rc.getTotal(first, second, third);

        System.out.println("Two-Marks Total:" + twoMarksTotal);
        System.out.println("Three-Marks Total:" + threeMarksTotal);
        sc.close();
    }
}
