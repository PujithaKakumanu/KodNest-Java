class DoWhileDemo {
    public static void main(String[] args) {
        // do-while loop is used to execute a block of code multiple times
        // syntax: do{
        //     // code to be executed
        // }while(condition);
        // condition is checked after each iteration
        // increment/decrement is executed after each iteration
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        }while(i <= 10);
        System.out.println();

        // Difference between do-while and while loop
        // do-while loop executes the code at least once
        // while loop executes the code only if the condition is true
        int i1 = 10;
        while (i1 <= 5) {
            System.out.println(i1);
            i1++;
        }
        int i2 = 10;
        do {
            System.out.println(i2);
            i2++;
        }while(i2 <= 5);

        int i3 = 1;
        do{
            int j = 1;
            do{
                System.out.print(j + " ");
                j++;
            }while (j <= 5);
            System.out.println();
            i3++;
        }while (i3 <= 5);
    }
}
