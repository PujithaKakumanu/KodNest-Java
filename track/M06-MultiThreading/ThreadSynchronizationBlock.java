class Hospital implements Runnable {
    String res1="Bed";
    String res2="Doctor";
    @Override
    public void run(){
        String threadName=Thread.currentThread().getName();
        if(threadName.equals("TOM")){
            tomTreatment();
        }
        else{
            jerryTreatment();
        }
    }
    void tomTreatment(){
        try{
            synchronized(res1) {
                System.out.println("Tom has taken the "+res1);
                Thread.sleep(3000);
                synchronized(res2){
                    System.out.println("Tom has taken the "+res2);
                    Thread.sleep(3000);
                }
                System.out.println("Tom has finished the task:"+res2);
            }
            System.out.println("Tom has finished the task:"+res1);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    void jerryTreatment(){
        try{
            synchronized(res1) {
                System.out.println("Jerry has taken the "+res1);
                Thread.sleep(3000);
                synchronized(res2){
                    System.out.println("Jerry has taken the "+res2);
                    Thread.sleep(3000);
                }
                System.out.println("Jerry has finished the task:"+res2);
            }
            System.out.println("Jerry has finished the task:"+res1);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}

public class ThreadSynchronizationBlock {
    public static void main(String[] agrs){
        Hospital h = new Hospital();

        Thread t1 = new Thread(h);
        Thread t2 = new Thread(h);


        t1.setName("TOM");
        t2.setName("JERRY");

        t1.start();
        t2.start();

    }
    
}
