import java.util.*;
public class PrintIndicesOfKey {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of an array");
        int n = sc.nextInt();
        int []arr = new int [n];
        System.out.println("Enter the Elements of an array");
        for(int i=0;i<n;i++){
              arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of key");
        int key = sc.nextInt();
        printIndices(arr, 0, key);
    }

    public static int printIndices(int arr[],int i ,int key){
        
        if(i==arr.length){
            int [] ans = new int[0];
                  return ans;
                }
       int gettingAns = printIndices(arr,i+1,key);
        if(arr[i]==key)
        {
            int []temp = new int [gettingAns.length+1];
            printIndices(arr,i+1 ,key);
        }
    }
}

