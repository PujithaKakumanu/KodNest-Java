import java.util.Scanner;
class MinElementOfArray{
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int minimum = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i]<minimum){
                minimum = arr[i];
            }
        }
        System.out.println("Minimum element of an array is: "+minimum);
    sc.close();
    }
    
}
