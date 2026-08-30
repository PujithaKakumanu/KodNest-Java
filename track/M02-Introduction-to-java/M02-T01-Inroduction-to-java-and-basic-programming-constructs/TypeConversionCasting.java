// type conversion is the process of converting one data type to another data type

//Widening Conversion (Implicit)

// Narrowing Conversion (Explicit)

// widening conversion happen when smaller data type is converted to larger data type
// widening conversion happen implicitly
// example : int a = 10; double b = a;

// Narrowing conversion happen when larger data type is converted to smaller data type
// narrowing conversion happen explicitly
// example : double a = 10.5; int b = (int) a;
// dataloss may occur in narrowing conversion

// most important interview question
// What is the difference between type promotion and type casting?
// Answer : type promotion is the process of converting one data type to another data type
// type promotion happen implicitly
// example : int a = 10; double b = a;  // type promotion
// type casting is the process of converting one data type to another data type
// type casting happen explicitly
// example : double a = 10.5; int b = (int) a;  // type casting


// cast Syntax: (Target Data Type) variable

public class TypeConversionCasting {
    public static void main(String[] args){
        int a = 10;
        double b = a;  // widening conversion
        System.out.println(b); 
        
        double c = 10.5;
        int d = (int) c;  // narrowing conversion
        System.out.println(d); 

 // char and numeric values
        char e = 'A';
        int f = e;
        System.out.println(f);  // widening conversion

        char g = 'A';
        int h = (int) g;
        System.out.println(h);  // narrowing conversion

        // casting and calculation
        int marks = 200;
        int total = 400;
        double percentage = (double)marks/total*100;
        System.out.println(percentage);
        
        // Widening Conversion
        // byte-->short-->int-->long-->float-->double

        // Narrowing Conversion
        // double-->float-->long-->int-->short-->byte

        // why does double result = 9/4; stores 2.0 intstead of 2.25
        // because 9/4 is integer division and result is integer 2
        // then it is converted to double
        // to get 2.25 we need to convert one of the operands to double
        // double result = (double)9/4;
    }
}
