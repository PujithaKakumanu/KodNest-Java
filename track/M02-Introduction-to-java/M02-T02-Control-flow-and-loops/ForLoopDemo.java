class ForLoopDemo {
    public static void main(String[] args) {
        // for loop is used to execute a block of code multiple times
        // syntax: for(initialization; condition; increment/decrement){
        //     // code to be executed
        // }
        // initialization is executed only once
        // condition is checked before each iteration
        // increment/decrement is executed after each iteration
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Nested for loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for(int i=1;i<=3;i++){
            for(int j=1;j<=2;j++ ){
                if(j==2){
                    break;
                }
                System.out.println("i value: " + i +"  j value: " + j);
            }
            System.out.println();
        }

        // continue statement
        for(int i=1;i<=3;i++){
            for(int j=1;j<=4;j++ ){
                if(j==2){
                    continue;
                }
                System.out.println("i value: " + i +"  j value: " + j);
            }
            System.out.println();
        }
    }
}
