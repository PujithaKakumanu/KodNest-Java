
public class StringsInbuildMethods {

    public static void main(String[] args) {
        String s = "KodNest Technologies";

        System.out.println(s);

        //length() =>
        System.out.println(s.length());

        //isEmpty() =>
        System.out.println(s.isEmpty());
        String s1 = "";
        String s2 = " ";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());

        //isBlank() =>
        System.out.println(s.isBlank());
        System.out.println(s2.isBlank());
        System.out.println(s1.isBlank());

        // contains() =>
        System.out.println("Contains : " + s.contains("Technologies"));
        System.out.println("Contains : " + s.contains("abcd"));

        // indexOf() =>
        System.out.println("Index Of : " + s.indexOf("Technologies"));
        //System.out.println("Index Of : " + s.indexOf("abcd"));
        System.out.println("Index Of : " + s.indexOf('T'));
        System.out.println("Index Of : " + s.indexOf('e'));

        // startsWith() =>
        System.out.println(s.startsWith("Kod"));
        System.out.println(s.startsWith("Tech"));
        System.out.println(s.startsWith("abcd"));

        // endsWith() =>
        System.out.println(s.endsWith("ologies"));
        System.out.println(s.endsWith("Technologies"));
        System.out.println(s.endsWith("KodNest"));

        //charAt() =>
        System.out.println(s.charAt(0));
        //contains() =>
        System.out.println(s.contains("Technologies"));
        //substring() =>
        System.out.println(s.substring(0, 4));
        //toUpperCase() =>
        System.out.println(s.toUpperCase());
        //toLowerCase() =>
        System.out.println(s.toLowerCase());
        //equals() =>
        System.out.println(s.equals("KodNest Technologies"));
        //equalsIgnoreCase() =>
        System.out.println(s.equalsIgnoreCase("KodNest Technologies"));
        //compareTo() =>
        System.out.println(s.compareTo("KodNest Technologies"));
        //compareToIgnoreCase() =>
        System.out.println(s.compareToIgnoreCase("KodNest Technologies"));
        //indexOf() =>
        System.out.println(s.indexOf("Technologies"));
        //lastIndexOf() =>
        System.out.println(s.lastIndexOf("Technologies"));
        //replace() =>
        System.out.println(s.replace("Technologies", "Technologies"));
        //replaceFirst() =>
        System.out.println(s.replaceFirst("Technologies", "Technologies"));
        //replaceAll() =>
        System.out.println(s.replaceAll("Technologies", "Technologies"));
        //split() =>
        System.out.println(s.split(" "));
        //startsWith() =>
        System.out.println(s.startsWith("KodNest"));
        //endsWith() =>
        System.out.println(s.endsWith("Technologies"));
        //trim() =>
        System.out.println(s.trim());
        //subSequence() =>
        System.out.println(s.subSequence(0, 4));
        //trim() =>
        System.out.println(s.trim());

    }
}
