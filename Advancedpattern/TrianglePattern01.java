import java.util.*;
public class TrianglePattern01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
          for(int k=1;k<=i;k++)
          {
            if((i+k)%2==0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
            
        }
        System.out.println();
    }
}
}
