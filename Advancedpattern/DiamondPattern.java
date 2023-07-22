import java.util.*;
public class DiamondPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i+1;k++){
                System.out.print("*");
            }
           
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i+1;k++){
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
}
