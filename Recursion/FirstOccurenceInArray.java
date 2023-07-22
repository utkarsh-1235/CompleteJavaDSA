import java.util.*;
public class FirstOccurenceInArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of an array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key");
        int key = sc.nextInt();

        System.out.println("First occurence is"+FirstOccur(arr,key,0)+" "+"th index");
    }
    public static int FirstOccur(int arr[],int key , int i){
        if(i == arr.length-1){
             return -1;
        }
        if(arr[i]==key){
            return i+1;
        }
        if(arr[i]!=key){
    return FirstOccur(arr , key , i+1);
        }
     return i+1;
    }
}
