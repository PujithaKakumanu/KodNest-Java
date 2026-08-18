
import java.util.Scanner;
public class FrequencyCountOfArray {
    int count = 0;
    void countElement(int[] arr, int key){
        for(int i =0; i<arr.length; i++){
            if(arr[i]== key){
                count++;
;            }
        }
        System.out.println("Frequency of element "+key+" : "+count);

    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        FrequencyCountOfArray freq =  new FrequencyCountOfArray();
        freq.countElement(arr, key);

    }
}


