
public class ComparingStrings {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "JAVA";

        if (s1 == s2) {
            System.out.println("s1 and s2 are pointing to the same object(Ref are same)");
        } else {
            System.out.println("s1 and s2 are pointing to different objects(Ref are not same)");
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("s1 and s2 are equal(Strings are same ignoring case)");
        } else {
            System.out.println("s1 and s2 are not equal(Strings are not same ignoring case)");
        }

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));

        String s3 = new String("Java");
        String s4 = new String("Java");

        if (s3 == s4) {
            System.out.println("s3 and s4 are pointing to the same object(Ref are same)");
        } else {
            System.out.println("s3 and s4 are pointing to different objects(Ref are not same)");
        }

        if (s3.equalsIgnoreCase(s4)) {
            System.out.println("s3 and s4 are equal(Strings are same ignoring case)");
        } else {
            System.out.println("s3 and s4 are not equal(Strings are not same ignoring case)");
        }

        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareToIgnoreCase(s4));
    }
}
