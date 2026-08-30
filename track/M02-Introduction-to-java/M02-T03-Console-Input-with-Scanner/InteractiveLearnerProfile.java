import java.util.Scanner;
public class InteractiveLearnerProfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int nps = sc.nextInt();
        double perce = sc.nextDouble();
        System.out.println("Learner: "+name);
        System.out.println("Problems solved: "+nps);
        System.out.println("Assessment: "+perce);
        sc.close();

    }

}
