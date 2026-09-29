
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch[] = str.toCharArray();
        char newCharArray[] = new char[ch.length];
        int j = ch.length - 1;
        for (int i = 0; i < ch.length; i++) {
            newCharArray[i] = ch[j];
            j--;
        }
        String revStr = new String(newCharArray);
        if (str.equalsIgnoreCase(revStr)) {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
    }
}
