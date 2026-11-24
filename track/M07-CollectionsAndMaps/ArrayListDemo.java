import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args){
    
        ArrayList al = new ArrayList();

        System.out.println(al.isEmpty());

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.isEmpty());

        System.out.println(al.contains(30));
        System.out.println(al.contains(300));

        System.out.println(al.get(3));
        System.out.println(al.get(5));

        System.out.println(al.indexOf(20));
        System.out.println(al.indexOf(30));
        

        al.add(30);
        System.out.println(al.indexOf(30));
        System.out.println(al.lastIndexOf(30));

        al.remove(6);
        al.remove(2);
        System.out.println(al);

        al.add("Raja");
        al.add("Rani");
        ArrayList al2 = new ArrayList();

        al2.add(12);
        al2.add(13);
        al2.add(14);
        al.addAll(al2);
        System.out.println(al);
    }

}
