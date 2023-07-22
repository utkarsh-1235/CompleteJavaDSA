import java.lang.StringBuilder;
public class MyStringBuilder {
    public static void main(String args[]){
        System.out.println("Enter the String");
        MyStringBuilder sb = new MyStringBuilder();
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }

        System.out.println(sb);
    }
}
