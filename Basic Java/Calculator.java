import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any operator like +,-,*,/,%");
        char operator = sc.next().charAt(0);
        System.out.println("Enter First number");
        int a= sc.nextInt();
        System.out.println("Enter second operator");
        int b = sc.nextInt();
        int c;
        switch(operator){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("No operation");
        }

    }
}
