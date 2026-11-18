// Multi Threading is achieved by implementing Runnable Interface
// Here we are implement the Runnable Interfaces
// we need to create Thread-objects for Runnable interface objects by passing reference varaiable to Thread class constructor 
// And then call start method on thread objects
import java.util.Scanner;

class AdditionImp implements Runnable{
	@Override
	public void run() {
		System.out.println("addition started...");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		int res=a+b;
		System.out.println("Addition is:"+res);
		System.out.println("Addition completed...");
	}

}

class PrintCharImp implements Runnable{
	@Override
	public void run() {
		System.out.println("PrintingChar started....");
		for(char c='A'; c<='G';c++) {
			System.out.println(c);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("PrintingChar completed....");
	}
}

class PrintNumImp implements Runnable {
	@Override
	public void run() {
		System.out.println("PrintingNum started...");
		for(int i = 0; i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("PrintingNum completed...");
	}
}


public class MultiThreadUsingInterfaces {
	public static void main(String[] args) {
		new Thread(new AdditionImp()).start();
		new Thread(new PrintNumImp()).start();
		new Thread(new PrintCharImp()).start();

	}

}