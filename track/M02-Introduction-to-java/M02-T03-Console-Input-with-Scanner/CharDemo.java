import java.util.Scanner;
class CharDemo  {
    public static void main(String[] args){

        // Iterating a string and printing each character using charAt() method
        String str = "Hello";
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }
        // Reading character from user
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter char :");
            char ch = scan.next().charAt(0);
            System.out.println(ch); 
        }
}
