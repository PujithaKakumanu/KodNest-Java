// String Cancatenation is the process of joining two strings
// + operator is used for String Concatenation
// String concatenation is done from left to right
// + operator on numeric values performs addition
// + operator on string and numeric values performs concatenation

// String and char are different in concatenation
// char + char performs ASCII value addition
// char + String performs concatenation
// String + char performs concatenation
// if either operand is string then it perform concatenation

public class StringCancatenation {
    public static void main(String[] args){
        String name = "kavya";
        int solvedProblems = 100;
        String message = name + " solved " + solvedProblems + " problems";
        
        System.out.println(message);

        System.out.println('A' + 'B');
        System.out.println(" "+'A'+'B');
    }
        
}
