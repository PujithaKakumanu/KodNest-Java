// If we have to store 3 students marks, first student marks may be 80,90,70
// second student marks may be 90,70,80,90
// third student marks may be 80,70
// So, number of columns are not same for all rows

import java.util.Scanner;
class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        int[][] arr = new int[row][];
        System.out.println("Enter the number of columns for each row:");
        for(int i = 0; i<arr.length; i++){
            int col = sc.nextInt();
            arr[i] = new int[col];
        }
        System.out.println("Enter the array elements:");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The array elements are:");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
