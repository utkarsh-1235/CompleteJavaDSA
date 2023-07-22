import java.util.*;
public class BinaryToDecimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number in Binary");
        int n = sc.nextInt();
        BinaryDeci(n);
    }
    public static void BinaryDeci(int n){

        int decimal = 0;
        int pow = 0;
        while(n>0){
            int temp = n%10;
            decimal = decimal + (temp*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println(decimal);
    }
}
