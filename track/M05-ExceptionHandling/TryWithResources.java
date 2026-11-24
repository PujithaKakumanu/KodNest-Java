import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter a: ");
			int a= sc.nextInt();
			System.out.println(a);
		}
	}

}
