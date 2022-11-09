import java.util.*;

public class bubbleSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }


        }
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
