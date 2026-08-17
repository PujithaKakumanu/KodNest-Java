class CompoundConditionDemo {
    public static void main(String[] args) {

        /*
         * Compound Condition is used to check multiple conditions at once 
         * and combine them to make a decision                                   
         * AND (&&) -> true if both conditions are true
         * OR (||) -> true if at least one condition is true
         * NOT (!) -> negates the condition                                 
         */
        int marks = 72;
        int attendance = 80;
        boolean projectCompleted = true;

        boolean marksEligible = marks >= 60;
        boolean attendanceEligible = attendance >= 75;
        boolean academicEligible = marksEligible && attendanceEligible;
        boolean placementEligible = academicEligible && projectCompleted;
        System.out.println("Placement Eligible: " + placementEligible); 

        int age = 10;
        int salary = 50000;

        if (age > 18 && salary > 20000) {
            System.out.println("Eligible for loan");
        } else {
            System.out.println("Not eligible for loan");
        }

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if (num1 > num2 && num1 > num3) {
            System.out.println("num1 is greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is greater");
        } else {
            System.out.println("num3 is greater");
        }

        // Using compound condition to check if the number is even or odd
        int num4 = 10;
        if (num4 % 2 == 0 && num4 % 3 == 0) {
            System.out.println("num4 is divisible by 2 and 3");
        } else {
            System.out.println("num4 is not divisible by 2 and 3");
        }

        // Using OR compound condition to check if the number is even or odd
        int num5 = 10;
        if (num5 % 2 == 0 || num5 % 3 == 0) {
            System.out.println("num5 is divisible by 2 or 3");
        } else {
            System.out.println("num5 is not divisible by 2 or 3");
        }

        // Using NOT compound condition to check if the number is even or odd
        int num6 = 10;
        if (!(num6 % 2 == 0 && num6 % 3 == 0)) {
            System.out.println("num6 is not divisible by 2 and 3");
        } else {
            System.out.println("num6 is divisible by 2 and 3");
        }

        // Checking if a number is within a range
        int num7 = 10;
        if (num7 >= 5 && num7 <= 15) {
            System.out.println("num7 is within the range 5 to 15");
        } else {
            System.out.println("num7 is not within the range 5 to 15");
        }

        // Checking if a number is outside a range
        int num8 = 10;
        if (num8 < 5 || num8 > 15) {
            System.out.println("num8 is outside the range 5 to 15");
        } else {
            System.out.println("num8 is within the range 5 to 15");
        }

        // Nested if-else
        int num9 = 10;
        if (num9 > 5) {
            if (num9 < 15) {
                System.out.println("num9 is within the range 5 to 15");
            }
        }
    }
}
