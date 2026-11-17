
import java.util.Scanner;

public class SingleThread {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Activity1
		System.out.println("Enter a value:");
		int a = sc.nextInt();

		//Activity2
		System.out.println("Enter n1 value:");
		int n1= sc.nextInt();
		System.out.println("Enter n2 value: ");
		int n2= sc.nextInt();
		int res = n1+n2;
		System.out.println("Addition is:"+res);

	}

}
