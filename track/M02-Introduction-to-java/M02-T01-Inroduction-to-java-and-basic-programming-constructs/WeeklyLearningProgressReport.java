public class WeeklyLearningProgressReport {
    public static void main(String[] args) {
        int Completedtopics = 17;
        int Totaltopics = 20;
        int Dailylearninghours = 3;
        int Learningdays = 5;
        int remainingTopics = Totaltopics-Completedtopics;
        int WeeklylearningHours = Learningdays*Dailylearninghours;
        double progressPercentage = (double)Completedtopics*100/Totaltopics;
        System.out.println("Completed Topics: "+ Completedtopics);
        System.out.println("Remaining Topics: "+remainingTopics);
        System.out.println("Weekly Learning Hours: "+WeeklylearningHours);
        System.out.println("Progress Percentage: "+progressPercentage);
    }
        
    
}
