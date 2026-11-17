// Exception: Un excepected event that interrupts the normal flow of execution of a program at runtime. 
// Exception can be handled by using try-catch,finally,throw,throws keywrds .
// When an exception occurs, the Java runtime system transfers control to the exception handler.



public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}h
