import java.util.*;
public class SelectionSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of an array");
        int n = sc.nextInt();
         int []arr = new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
         int min,minIndex;
        for(int i=0;i<n-1;i++){
            min = arr[i];
            minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[minIndex]>arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Our sorted array is");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}