import java.util.Scanner;
public class InputWithConditionsAndLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        int total = 0;
        String status = null;

        for (int day =1 ; day <= days; day++){
        int solved = scanner.nextInt();
        total+= solved ;

        if (total>=20) {
            status = "Strong progress";
        }
        else if(total>=10 && total <= 19){
            status = "Keep improving";
        }
        else{
            status = "Needs more practice";
        }
    }
    System.out.println("Total solved: "+ total);
    System.out.println("Status: "+status);
    scanner.close();
    }
}
