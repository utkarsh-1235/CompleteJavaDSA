import java.util.*;
public class HollowRhombusPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
          for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    
                    System.out.print("*");
                }
                else{
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }
    }
}
