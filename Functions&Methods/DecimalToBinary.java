import java.util.*;
public class DecimalToBinary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number in Decimal");
        int n = sc.nextInt();
          DeciToBinary(n);
    }


    public static void DeciToBinary(int n)
    { int pow = 0;
        int binary =0 ;
        while(n>0){
            int temp = n%2;
             binary = binary + (temp*(int)Math.pow(10,pow));
             pow++;
             n = n/2;
        }
        System.out.println(n+binary);
    }
}
