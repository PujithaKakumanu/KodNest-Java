import java.util.Scanner;
class Activity extends Thread {
    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        if(threadName.equals("ADD")){
            addition();

        }else if(threadName.equals("NUM")){
            printNum();

        }else{
            printChar();
        }

    }
    void addition(){
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

    void printNum(){
        System.out.println("PrintingChar started....");
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("PrintingChar completed....");
    }
    void printChar(){
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

public class StanderdThreadExcution {
    public static void main(String[] args){
        Activity ac1 = new Activity();
        Activity ac2 = new Activity();
        Activity ac3 = new Activity();

        ac1.start();
        ac2.start();
        ac3.start();

        ac1.setName("ADD");
        ac2.setName("NUM");
        ac3.setName("CHAR");

    }
    
}
