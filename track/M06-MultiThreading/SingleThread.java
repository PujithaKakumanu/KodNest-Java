// Excuting all the programms are in singleThread 
// we are excuting all the tasks in single thread,
// first activity will excute completely then it goes to the remaining activities.
// for that time we are  wasting the cpu time, to avoid this problem we are using multithreading.
import java.util.Scanner;

public class SingleThread {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Activity1
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		System.out.println("Value is: "+a);

		//Activity2
		System.out.println("Enter n1 value:");
		int n1= sc.nextInt();
		System.out.println("Enter n2 value: ");
		int n2= sc.nextInt();
		int res = n1+n2;
		System.out.println("Addition is:"+res);

	}

}
