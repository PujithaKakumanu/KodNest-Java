import java.util.Scanner;
class AdditionJoin extends Thread {
    @Override
    public void run(){
        System.out.println("Addition Started and using the file...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a= sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        int res = a+b;
        System.out.println("Addition is: "+res);
        System.out.println("Addition completed and stoppedusing the file....");
    }
}

class PrintNumJoin extends Thread{
    @Override
    public void run(){
        System.out.println("PrintNum started and using the file...");
        for(int i = 1; i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(3000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
        }
        System.out.println("PrintNum completed and stop using the file...");
    }
}

class PrintCharJoin extends Thread{
    @Override
    public void run(){
        System.out.println("PrintChar started and using the file...");
        for(char ch ='A'; ch<='G';ch++){
            System.out.println(ch);
            try{
                Thread.sleep(3000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("PrintChar completed and stop using the file...");
    }
}

public class ThreadJoin {
    public static void main(String[] args){
        System.out.println("Main Thread Execution started and opened the file");
        AdditionJoin adj= new AdditionJoin();
        PrintNumJoin pnj = new PrintNumJoin();
        PrintCharJoin pcj = new PrintCharJoin();
        adj.start();
        pnj.start();
        pcj.start();

        try{
            adj.join();
            pnj.join();
            pcj.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        pnj.interrupt();
        System.out.println("Main Thread Excecution completed and stoped using the file");

    }
}
