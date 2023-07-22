import java.util.*;
public class NumberPyramidPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        //int count = 0;
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){

                    System.out.print(i);
            }
           
            System.out.println();
        }
    }
}
