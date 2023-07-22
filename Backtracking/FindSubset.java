public class FindSubset {
    public static void findsubset(String str, int i,String ans){
        if(i==str.length()){
          if(ans.length()==0){
            System.out.println("null");
          }
          else{
            System.out.println(ans);
          }
          return;
        }
        //Yes choice
        findsubset(str,i+1,ans+str.charAt(i));

        //No choice
        findsubset(str,i+1,ans);
    }
    public static void main(String args[]){
          String str = new String("abcde");
          findsubset(str, 0,"" );
    }
}
