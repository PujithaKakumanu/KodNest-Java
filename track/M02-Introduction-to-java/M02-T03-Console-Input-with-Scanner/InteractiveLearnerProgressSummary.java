import java.util.Scanner;
public class InteractiveLearnerProgressSummary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the learner details
        String name = scanner.nextLine();
        int practiceDays= scanner.nextInt();

        int total = 0;
        String status = null;

        for(int i = 0; i<practiceDays; i++){
            int solvedProblems = scanner.nextInt();
            total += solvedProblems;
        }

        // Calculate and display the progress summary
        double avg = (double)total/practiceDays;

        if (avg >= 5.0){
            status = "Consistent";
        } else {
            status = "Needs consistency";
        }

        System.out.println("Learner: "+name);
        System.out.println("Total solved: "+total);
        System.out.println("Daily average: "+avg);
        System.out.println("Status: "+status);

        scanner.close();
    }
}
