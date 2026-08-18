import java.util.Scanner;

class ScannerWithLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int total = 0;
        for(int day = 1; day <= days; day++){
            int solved = sc.nextInt();
            total += solved;
        }
        System.out.println(total);
    }
}
