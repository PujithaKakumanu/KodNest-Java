// In java we have 2 types of data types
// 1. Primitive Data Types
// 2. Non-Primitive Data Types

// Primitive Data Types: are datatypes that are predefined in java and stored in stack memory
// Primitive data types can't be considered as objects
// The primitive data types are classified into 4 types

// 1. Integer Types
// 2. Floating Point Types
// 3. Char Types
// 4. Boolean Types

// Integer Types: are datatypes that are used to store integer values
// byte: 1 byte
// short: 2 bytes
// int: 4 bytes
// long: 8 bytes

// Floating Point Types: are datatypes that are used to store floating point values
// float: 4 bytes
// double: 8 bytes

// Char Types: are datatypes that are used to store character values
// char: 2 bytes

// Boolean Types: are datatypes that are used to store boolean values
// boolean: 1 byte

public class PrimitiveDataTypes {
    public static void main(String[] args){

        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 10.5f;
        double d = 10.5;
        char c = 'a';
        boolean bl = true;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bl);
    }
}
