// In Multi-Threading it will excute all the programs simultaneously
// All are independent activities -> If one is sleep others are excute 
// MultiTeading is achieved by:
// 1. Creating Thread class which is extends from main Thread class, Overriding run() method
// 2. Creating objects
// 3. Call start() method with reference variable

import java.util.Scanner;

class Addition extends Thread {
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

class PrintChar extends Thread{
	@Override
	public void run() {
		System.out.println("PrintingChar started....");
		for(char c='A'; c<='G';c++) {
			System.out.println(c);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("PrintingChar completed....");
	}

}

class PrintNum extends Thread{
	@Override
	public void run() {
		System.out.println("PrintingNum started...");
		for(int i = 0; i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("PrintingNum completed...");
	}

}

public class MultiThreadExcecution {

	public static void main(String[] args) {
		Addition ad = new Addition();
		PrintNum pn = new PrintNum();
		PrintChar pc = new PrintChar();
	
		ad.start();
		pn.start();
		pc.start();

	}

}
