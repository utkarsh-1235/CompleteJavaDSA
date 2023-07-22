import java.util.*;
public class insertionSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of an array");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the Elements of an array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<n;i++){
            int prev = i-1;
             int cur = arr[i];

             while(prev>=0 && arr[prev]>cur){
                arr[prev+1] = arr[prev];
                prev--;
             }

             arr[prev+1]=cur;
        }

        System.out.println("Sorted Array is");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

}
