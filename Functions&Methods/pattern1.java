import java.util.*;
public class pattern1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
           /*  for(int k=i;k>=1;k--){
                System.out.print("*");
            }*/
            System.out.println();
        }
    }
}
