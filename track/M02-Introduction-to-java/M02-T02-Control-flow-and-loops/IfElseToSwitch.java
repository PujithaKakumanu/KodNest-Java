public class IfElseToSwitch {
    public static void main(String[] args) {
        int day = 6;

        if (day >= 1 && day <= 5) {
            System.out.println("Learning Day");
        } else if (day == 6 || day == 7) {
            System.out.println("Revision Day");
        } else {
            System.out.println("Invalid Day");
        }

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Learning Day");
                break;
            case 6:
            case 7:
                System.out.println("Revision Day");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}