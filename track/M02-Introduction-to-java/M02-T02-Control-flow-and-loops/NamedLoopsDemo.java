class NamedLoopsDemo {
    public static void main(String[] args) {

        // Named for loop is used to break the outer loop
        // syntax: label:for(int i=1;i<=3;i++){
        //     label:for(int j=1;j<=2;j++ ){
        //         if(j==2){
        //             break label;
        //         }
        //         System.out.println("i value: " + i +"  j value: " + j);
        //     }
        //     System.out.println();
        // }
        outer:for(int i=1;i<=3;i++){
            inner:for(int j=1;j<=4;j++ ){
                if(j==4){
                    break outer;
                }
                System.out.println("i value: " + i +"  j value: " + j);
            }
            System.out.println();
        }
    }
}
