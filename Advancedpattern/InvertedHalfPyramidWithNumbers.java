import java.util.*;
public class InvertedHalfPyramidWithNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();

        for(int i=n;i>=1;i--){
          for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
