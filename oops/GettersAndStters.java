public class GettersAndStters {
    public static void main(String args[]){
          
        pen obj = new pen();
        obj.SetColor("Red");
        obj.getColor();
        System.out.println(obj.newcolor);
    }

}

class pen{
    String newcolor;
    void SetColor(String color){
          newcolor = color;
    }

    String getColor(){
        return this.newcolor;
    }
}
