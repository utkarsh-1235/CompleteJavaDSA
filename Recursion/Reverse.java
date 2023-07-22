import java.util.*;
public class Reverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of an array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        reverse(arr, n-1);
    }

    public static void reverse(int arr[],int i){
        if(i== -1){
            return ;
        }
        System.out.println(arr[i]);
        reverse(arr, i-1);
    }
}
