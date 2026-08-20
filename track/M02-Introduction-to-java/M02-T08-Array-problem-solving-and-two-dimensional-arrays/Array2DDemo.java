// The Problem with 1D array is we cant store the data in rows and columns
// To over come the 1D array issues we go with 2D array
// We can store the data in form of table
// 2D array is used to represent the matrix
// for example, if we have to store marks of 3 students in 4 subjects, we can use 2d array
// here 3 is no. of rows and 4 is no. of columns
// In 2d array length method will give us the no. of rows
// arr[0].length will give us the no. of columns
// Syntax : dataType[][] arr = new dataType[rows][columns]


import java.util.Scanner;
class Array2DDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        // Reading the elements
        System.out.println("Enter the array elements:");
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j < arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // Printing the elements
        System.out.println("The array  elements are: ");
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}