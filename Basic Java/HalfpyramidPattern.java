import java.util.Scanner;
public class HalfpyramidPattern {
  public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Number");
         int n = sc.nextInt();
         /*for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
         }*/

        char ch = 'A';
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
         }
  }
}
