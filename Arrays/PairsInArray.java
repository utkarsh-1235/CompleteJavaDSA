import java.util.*;
public class PairsInArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an array");
        int n = sc.nextInt();
        int [] arr = new int[100];
         
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                
        }
        
    }
}
}