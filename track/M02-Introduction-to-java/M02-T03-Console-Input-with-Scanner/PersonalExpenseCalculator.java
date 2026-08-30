import java.util.Scanner;
public class PersonalExpenseCalculator {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double income = scanner.nextDouble();

    double rent = scanner.nextDouble();
    double food = scanner.nextDouble();
    double travel = scanner.nextDouble();

    double totalExpense = rent + food + travel;
    double remaining = income - totalExpense;

    String status;

    if (remaining >= 0) {
        status = "Within budget";

    } else {
        status = "Over budget";
    }

    System.out.println("Total expense: " + totalExpense);
    System.out.println("Remaining: " + remaining);
    System.out.println("Status: " + status);
    
    scanner.close();
    }
        
}
