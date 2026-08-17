class NestedWhileDemo {
    public static void main(String[] args) {
        // nested while loop is used to execute a block of code multiple times
        // syntax: while(condition1){
        //     while(condition2){
        //         // code to be executed
        //     }
        // }
        // condition1 is checked before each iteration
        // condition2 is checked before each iteration
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
