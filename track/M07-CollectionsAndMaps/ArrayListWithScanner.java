import java.util.*;
public class ArrayListWithScanner {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements: ");
        for(int i =0; i<n;i++){
            int element = sc.nextInt();
            al.add(element);
        }

        System.out.println("ArrayList: "+al);
        System.out.println();

        System.out.println("Traverse using FOR_LOOP...");
        for(int i =0; i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }

        System.out.println();
        
        System.out.println("Traverse Using ADVFOR-LOOP...");
        for(Object x: al){
            System.out.print(x+" ");
        }
    }
}
