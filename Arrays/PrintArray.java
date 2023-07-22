import java.util.*;
public class PrintArray {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of an array");
    int n = sc.nextInt();
    int [] arr = new int[100];
     
    System.out.println("Enter the elements of an array");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("--------------------");
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
  }  
}
