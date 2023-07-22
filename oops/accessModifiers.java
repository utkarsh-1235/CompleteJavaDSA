public class accessModifiers {
 public static void main(String args[]){
     hello obj = new hello();
     System.out.println(obj.str);
     System.out.println(obj.sname);

 }
}

class hello{
  public String str = "hello";
    private String hyl = "utkarsh";
    protected String sname = "saxena"; 
}

