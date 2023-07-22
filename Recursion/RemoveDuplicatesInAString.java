public class RemoveDuplicatesInAString {
    public static void main(String args[]){
       String str = "appnacollege";

       removeDuplicates(str, 0, new StringBuilder(""), new boolean [26]);
    }

    public static void removeDuplicates(String str , int idx , StringBuilder newStr , boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return ;
        }

        //Kaam
        char currchar = str.charAt(idx);
        if(map[currchar-'a']==true){
            //duplicate

            removeDuplicates(str, idx+1, newStr, map);
        }
        else{
            map[currchar-'a']=true;
            removeDuplicates(str, idx+1, newStr.append(currchar), map);
        }
    }
    
}
