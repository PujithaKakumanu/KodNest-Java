// Thread: Thread is a single unit of process(Thread is a single line of excecution inside the task)
// MultiThreading: When multiple threads are running at the same time
// Multithreading: The process of creating multipul threads to excecute independent activites inside the task.
// main Thread is creted by JVM
// main stack is created by Jvm
// Thread Scheduler(TS) manage the thread life cycle, priorityheduling and context switching.


public class ThreadExcecutionDemo {
	public static void main(String[] args) {
        Thread t = Thread.currentThread();
		System.out.println(t);

		 // To change the name of thread using built-in methods
		t.setName("thread1");
		System.out.println(t);

		 // To change the Priority of the Thread
		t.setPriority(8);
		System.out.println(t);

		 // To give the minimum priority to thread
		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t);

		 // To give the maximum priority to thread
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t);

		 // To get the class of the Thread
		System.out.println(t.getClass());

		 // To get the only Priority of the Thread
		System.out.println( t.getPriority());

		 // To get the only Thread Name
		System.out.println( t.getName());
		
		 // To get the status of the thread
		System.out.println(t.getState());
	}

}
// Thread[#1,main,5,main]  main - name of the thread, 5 - priority of the thread, main - name of the stack