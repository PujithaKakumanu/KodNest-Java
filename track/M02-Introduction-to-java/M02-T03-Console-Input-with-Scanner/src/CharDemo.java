import java.util.Scanner;
class ScannerDemo2  {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter char :");
        char ch = scan.next().charAt(2);
        System.out.println(ch); 
        scan.close();
    }
}
