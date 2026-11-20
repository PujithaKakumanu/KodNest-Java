//Synchronize is used to prevent data loss or race condition
// race-condition: If multipul Threads try to acess the same resource they are  in race to complete the task.

public class RaceConditionInThreads {
    static int count =10;
    public static void main(String[] args){

        Thread t1=new Thread(){
            @Override
            public void run(){
                count = count-1;  //9
            }

        };
        Thread t2 =new Thread(){
            @Override
            public void run(){
                count = count-1;   //9
            }
        };
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();

        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Final Count is: "+count);
    }
}
