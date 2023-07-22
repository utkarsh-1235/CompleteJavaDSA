public class CreatingClasses{
   public static void main(String args[]){
        pen obj = new pen();
        obj.SetColor("Red");
        obj.SetTip(10);

        student obj1 = new student();
        obj1.calcPercentage(98, 99, 100);
   }
}

 class pen{
       String color;
       int tip;

       void SetColor(String newColor ){
        color = newColor ;
        System.out.println(color);
       }

       void SetTip(int newTip){
        tip = newTip;
        System.out.println(tip);
       }
}

class student{
    String name;
    int age;
    float percentage;  //cgpa

    void calcPercentage(int phy,int chem,int maths){
        percentage = (phy+chem+maths)/3;
        System.out.println(percentage);
    }
}