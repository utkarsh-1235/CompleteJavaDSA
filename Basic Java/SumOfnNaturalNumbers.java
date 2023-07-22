import java.util.Scanner;
public class SumOfnNaturalNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int n = sc.nextInt();
        int sum=0 , i=1;
        while(i<=n){
            sum = sum+i;
            System.out.println(sum);
            i++;
        }
    }
}
