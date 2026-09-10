// String is a sequence of characters enclosed in double quotes.

// Strings are of two types : 
// 1. mutable (possible to change and modify the string) (Ex: "StringBuilder", "StringBuffer")
// 2. immutable (not possible to change and modify the string) (Ex: "String")
// In java, when we create a string using literals, it is stored in String pool(Constant String Pool(CSP) and Non-CSP)
// CSP => when we create the string using literals (only one memory location is created and all the strings are pointing to the same object)(Duplicate not allowed)
// Non-CSP => when we create the string using new keyword (new memory location is created for each string)(Duplicate allowed)
// String s1 = "Java"; s2 = "Java"; (s1 and s2 are pointing to the same object)
// In java, when we create a string using new keyword, it is stored in heap.
// String s3 = new String("Java"); s4 = new String("Java"); (s3 and s4 are pointing to different objects)
// StringBuilder sb1 = new StringBuilder("Java"); 
// StringBuilder sb2 = new StringBuilder("Java"); (sb1 and sb2 are pointing to different objects)
// StringBuffer sb3 = new StringBuffer("Java"); 
// StringBuffer sb4 = new StringBuffer("Java"); (sb3 and sb4 are pointing to different objects)
// When we compare two strings using == operator, it compares the references.
// When we compare two strings using equals() method, it compares the contents.
public class StringsDemo {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        if (s1 == s2) {
            System.out.println("s1 and s2 are pointing to the same object(Ref are equal)");
        } else {
            System.out.println("s1 and s2 are pointing to different objects(Ref are not equal)");
        }

        String s3 = new String("Java");
        String s4 = new String("Java");

        if (s3 == s4) {
            System.out.println("s3 and s4 are pointing to the same object(Ref are equal)");
        } else {
            System.out.println("s3 and s4 are pointing to different objects(Ref are not equal)");
        }

        if (s1.equals(s2)) {
            System.out.println("s1 and s2 are equal(Content is same)");
        } else {
            System.out.println("s1 and s2 are not equal(Content is not same)");
        }

        if (s3.equals(s4)) {
            System.out.println("s3 and s4 are equal(Content is same)");
        } else {
            System.out.println("s3 and s4 are not equal(Content is not same)");
        }

    }
}
