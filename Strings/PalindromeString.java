import java.util.*;
public class PalindromeString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<=str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i)!= str.charAt(n-i-1)){
                System.out.println("String is not palindrome");
                break;
            }
            else{
                System.out.println("String is Palindrome");
            }
        }
    }
}
