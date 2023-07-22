public class SingleInheritance {
    public static void main(String args[]){
           Fish shark = new Fish();
           shark.eat();
           shark.breathe();
           shark.swim();
    }
}

// Base Class
class animal{
    void eat(){
        System.out.println("Eat");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

// Derived Class
class Fish extends animal{
    int fins;
    void swim(){
        System.out.println("Swim in water");
    }
}
