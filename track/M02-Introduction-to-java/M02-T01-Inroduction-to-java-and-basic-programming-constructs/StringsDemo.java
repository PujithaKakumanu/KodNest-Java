// String is a non-primitive data type
// String is a Class in java
// Strings are stored in heap memory
// String is immutable
// String is used to store sequence of characters
// String class is present in java.lang package


// We can create strings in two ways:
// 1. String literal: (String s = "Hello";)
// 2. String object: (String s = new String("Hello");)

// String class provides various methods to perform operations on strings
// The most used important methods are:
// 1. length(): used to find the length of the string
// 2. toUpperCase(): used to convert the string to uppercase
// 3. toLowerCase(): used to convert the string to lowercase
// 4. equals(): used to compare the two strings
// 5. equalsIgnoreCase(): used to compare the two strings ignoring the case
// 6. compareTo(): used to compare the two strings
// 7. trim(): used to remove the leading and trailing spaces
// 8. charAt(): used to get the character at the specified index
// 9. indexOf(): used to get the index of the specified character
// 10. lastIndexOf(): used to get the last index of the specified character
// 11. substring(): used to get the substring
// 12. replace(): used to replace the specified character
// 13. replaceAll(): used to replace the specified character
// 14. split(): used to split the string
// 15. concat(): used to concatenate the strings
// 16. isEmpty(): used to check if the string is empty
// 17. isBlank(): used to check if the string is blank
// 18. Character.isDigit(): used to check if a character is a digit
// 19. Character.isLetter(): used to check if a character is a letter
// 20. Character.isLetterOrDigit(): used to check if a character is a letter or digit
// 21. Character.isUpperCase(): used to check if a character is uppercase
// 22. Character.isLowerCase(): used to check if a character is lowercase
// 23. valueOf(): used to convert the string to other types

// String literal method is more efficient than String object method

// String comparison:
// 1. == operator: compares references
// 2. .equals() method: compares values
// String pool: is a special memory area in heap memory where strings are stored

public class StringsDemo {
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));

        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.trim());
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf('l'));
        System.out.println(s1.lastIndexOf('l'));
        System.out.println(s1.substring(0, 2));
        System.out.println(s1.replace('l', 'k'));
        System.out.println(s1.replaceAll("l", "p"));
        System.out.println(s1.concat(" World"));
    }
}
  