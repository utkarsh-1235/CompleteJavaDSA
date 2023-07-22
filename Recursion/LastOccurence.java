import java.util.*;
public class LastOccurence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of an array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the Elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key to find");
      int key = sc.nextInt();
        System.out.println(lastOccurence(arr,key,n-1));
    }

    public static int lastOccurence(int arr[],int key, int i){
        if(i==0 && arr[i]!=key){
            return -1;
        }
        else if(i==0){
            return 1;
        }
        if(arr[i]==key)
        {
            
            return i;
        }

    lastOccurence(arr,key,i-1);
    return i;
    }
}
