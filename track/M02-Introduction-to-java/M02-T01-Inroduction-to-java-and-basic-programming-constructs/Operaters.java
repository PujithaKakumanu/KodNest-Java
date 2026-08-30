// Operaters are used to perform operations on variables
// In java there are 5 types of operators
// 1. Arithmetic operators (+, -, *, /, %): Take numaric values as inputs and return numaric value as output.
// 2. Relational operators (==, !=, <, >, <=, >=): Take two numeric values as inputs and return boolean value as output.
// 3. Logical operators (&&, ||, !): Take boolean values as inputs and return boolean value as output.
// 4. Assignment operators (=, +=, -=, *=, /=, %=): Take value as input and update it in variable as output.
// 5. Unary operators (++, --): Take single numeric value as input and return modified value as output.


// operator precedence and associativity: (left to right)

// operator precedence:
// ()  : highest precedence
// ++, -- : second highest precedence
// *, /, % : third highest precedence
// +, - : fourth highest precedence
// ==, !=, <, >, <=, >= : fifth highest precedence
// && : sixth highest precedence
// || : seventh highest precedence
// = : lowest precedence

// important notes:
// relational operators are used to compare values
// logical operators are used to combine boolean values
// assignment operators are used to assign values
// unary operators are used to perform operations on single values


public class Operaters {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);

        System.out.println(a == b && a > b);
        System.out.println(a == b || a > b);
        System.out.println(a != b);

        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);

        System.out.println(++a);
        System.out.println(--a);

        
    }
}
