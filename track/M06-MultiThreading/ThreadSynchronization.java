// Synchronize is used to prevent data loss or race condition
// race-condition: If multipul Threads try to acess the same resource they are  in race to complete the task.
// synchronized(lock) is a keyword which is used to prevent data loss or race conditiod 
// synchronized for methods:

class Printer implements Runnable {
    @Override
    synchronized public void run(){ 
        try{
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" Started using PrinterResource");
            Thread.sleep(3000);
            System.out.println(threadName+" Still using PrinterResource");
            Thread.sleep(3000);
            System.out.println(threadName+" Stopped using PrinterResource");
            Thread.sleep(3000);


        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
public class ThreadSynchronization {
    public static void main(String[] args){

        Printer pr = new Printer();

        Thread t1 = new Thread(pr);
        Thread t2 = new Thread(pr);
        Thread t3 = new Thread(pr);

        t1.setName("Java Devloper");
        t2.setName("Python Devloper");
        t3.setName("C Devloper");

        t1.start();
        t2.start();
        t3.start();



    }
    
}
