public class IfElseDemo {

    public static void main(String[] args) {
        int num = -12;
        int firstNumber = 12;
        int secondNumber = 23;
        
        if(num>0){
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }

        if(num % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        if (firstNumber >= secondNumber){
            System.out.println("Larger score: " + firstNumber);
        }
        else{
            System.out.println("Larger score: " + secondNumber);
        }
    }
}
