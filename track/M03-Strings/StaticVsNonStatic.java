
// static inside non-static methods is not allowed in Java.
// but non-static inside static is allowed in java, Becase static block is executed before the non-static method.
// and even static variables are also allowed in non-static methods.
// but non-static variables are not allowed in static methods.
public class StaticVsNonStatic {

    static {
        System.out.println("First Static Block");
    }

    static {
        System.out.println("Second Static Block");
    }

    static {
        System.out.println("Third Static Block");
    }

    {
        System.out.println("First Non-Static Block");
    }

    {
        System.out.println("Second Non-Static Block");
    }

    {
        System.out.println("Third Non-Static Block");
    }

    StaticVsNonStatic() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        StaticVsNonStatic s1 = new StaticVsNonStatic();
        System.out.println();
        StaticVsNonStatic s2 = new StaticVsNonStatic();
        System.out.println();
        StaticVsNonStatic s3 = new StaticVsNonStatic();

        System.out.println("Main Method");
    }

}
