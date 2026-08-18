class SwitchDemo {
    
    public static void main(String[] args) {
        // switch is used to select one of many code blocks to be executed
        // it is used when there are multiple conditions to be checked
        // switch(expression){
        //     case value1: 
        //         // code to be executed
        //         break;
        //     case value2:
        //         // code to be executed
        //         break;
        //     default:
        //         // code to be executed
        // }
        int n = 10;
        switch (n) {
            case 10 -> System.out.println("Ten");
            case 20 -> System.out.println("twenty");
            case 30 -> System.out.println("thirty");
            default -> System.out.println("Invalid");
        } 

        // break used in switch to exit the switch block without executing the remaining cases
        // without break it will execute the remaining cases. Why becose of switch is for matching the cases.
        // and it will continue to execute the remaining cases until it finds a break statement.
        int n1 = 10;
        switch (n1) {
            case 10:
                System.out.println("Ten");
                break;
            case 20:
                System.out.println("twenty");
                break;
            case 30:    
                System.out.println("thirty");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        
    }
}
