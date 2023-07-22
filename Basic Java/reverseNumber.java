import java.util.Scanner;
public class reverseNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = 0;
        while(n>0){
            int lastdigit = n%10;
            temp = temp*10 + lastdigit;
            System.out.println(temp);
            n=n/10;
        }
    }
}