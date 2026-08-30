public class SimpleInterestBMIMarksPercentage {
    public static void main(String[] args) {
        double principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;
        double weight = 72.0;
        double height = 1.8;
        double simpleInterest;
        simpleInterest = principal * rate * time/100.0;
        double totalamount;
        totalamount = principal + simpleInterest;
        double bmi;
        bmi = weight / (height * height);
        int totalmarks;
        totalmarks = 78+84+69+91+88;
        double percentage;
        percentage = totalmarks*100.0/500;

        System.out.println("Simple Interest: "+simpleInterest);
        System.out.println("Total Amount: "+totalamount);
        System.out.println("BMI: "+bmi);
        System.out.println("Total Marks: "+totalmarks);
        System.out.println("Percentage: "+percentage);
        
    }
}
