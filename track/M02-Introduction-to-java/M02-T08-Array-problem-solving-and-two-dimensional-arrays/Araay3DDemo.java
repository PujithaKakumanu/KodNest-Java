// If we have to store data of more than 2 dimensions, we go with 3d array
// syntax : dataType[][][] arr = new dataType[rows][columns][depth];
// arr.length = no. of rows
// arr[0].length = no. of columns
// arr[0][0].length = no. of depth
import java.util.Scanner;
class Araay3DDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int depth = sc.nextInt();
        int[][][] arr = new int[rows][cols][depth];
        // Reading the elements
        System.out.println("Enter the array elements:");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                for(int k = 0; k<arr[i][j].length; k++){
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        // Printing the elements
        System.out.println("The array elements are:");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                for(int k = 0; k<arr[i][j].length; k++){
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        sc.close();
        
    }
}
