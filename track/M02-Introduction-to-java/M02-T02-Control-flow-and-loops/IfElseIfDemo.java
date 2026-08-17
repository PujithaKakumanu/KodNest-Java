public class IfElseIfDemo {
    public static void main(String[] args) {
        int num = 10;
        // if block of code will excute if the condition is true
        if(num > 0){
            System.out.println("Positive");
        } 
        // else if block of code will excute if the condition is true
        else if(num < 0){
            System.out.println("Negative");
        } 
        // else block of code will excute if the condition is false
        else{
            System.out.println("Zero");
        }


        int number = -7;
        int firstScore = 18;
        int secondScore = 25;

        if (number > 0) {
            System.out.println("Number type: Positive");
        } else if (number < 0) {
            System.out.println("Number type: Negative");
        } else {
            System.out.println("Number type: Zero");
        }

        if (number % 2 == 0) {
            System.out.println("Parity: Even");
        } else {
            System.out.println("Parity: Odd");
        }

        if (firstScore >= secondScore) {
            System.out.println("Larger score: " + firstScore);
        } else {
            System.out.println("Larger score: " + secondScore);
        }

        // Terinary operator is a shorthand for if-else statement
        // syntax: condition ? expression1 : expression2
        // if condition is true expression1 is executed else expression2 is executed
        String result = (num > 0) ? "Positive" : "Negative";
        System.out.println(result);

        // Nested terinary operator is a shorthand for if-else if-else statement
        // syntax: condition1 ? expression1 : condition2 ? expression2 : expression3
        // if condition1 is true expression1 is executed else if condition2 is true expression2 is executed else expression3 is executed
        String result1 = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(result1);

        // Using Ternary operator to check if the number is even or odd
        int num1 = 10;
        String result2 = (num1 % 2 == 0) ? "Even" : "Odd";
        System.out.println(result2);

        // Using Ternary operator to check  greatest of three numbers
        int num2 = 10;
        int num3 = 20;
        int num4 = 30;
        String result3 = (num2 > num3 && num2 > num4) ? "num2 is greater" : (num3 > num2 && num3 > num4) ? "num3 is greater" : "num4 is greater";
        System.out.println(result3);


        // if-break-continue statement
        // break statement is used to exit the loop or switch statement
        // continue statement is used to skip the current iteration
        
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
