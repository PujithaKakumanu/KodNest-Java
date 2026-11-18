import java.util.Scanner;

public class ArtmaticExceptionDemo {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		try {
			int res = a/b;
			System.out.println(res);
		}
		catch(ArithmeticException e) {
			System.out.println("Denominator can not devided by zero");
		}
		sc.close();
	}
}
