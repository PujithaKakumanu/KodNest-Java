// variables are containers that store values
// A variable is a named memory location that stores values at runtime depending on the data type
// using the variable we can retrive the value at any time
// Syntax: DataType variableName = value;

//Identifier rules:
// 1. Is case Sensitive
// 2. LowerCamelCase is the normal variable naming convention
// 3. can start with a letter, underscore or dollar sign
// 4. can't start with a number
// 5. can't contain special characters except underscore and dollar sign
// 6. can't be a reserved keyword



public class Variables {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;
        float f = 50.5f;
        double d = 60.6;
        char c = 'a';
        boolean bl = true;
        String str = "Hello"; 

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bl);
        System.out.println(str);
 
    }
}
