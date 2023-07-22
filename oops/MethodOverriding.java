public class MethodOverriding {
    public static void main(String args[]){
    
         calculator cl = new calculator();
         System.out.println(cl.sum(10,20));
         System.out.println(cl.sum((float)7.5,(float)10.5));
         System.out.println(cl.sum(10,20,30));
    }
}

class calculator{
    int sum(int a,int b){
        return a+b;
    }

    int sum(float a ,float b){
        return (int)a+(int)b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}