public class MultilevelInheritance {
    public static void main(String args[]){
        Herbivores herbi = new Herbivores() ; 
        herbi.eat();

        Carnivores carni = new Carnivores();
        carni.eat();
}
}
class Animals {
    String eat = "Eat";
    String breathe = "Breathe";
}

class Herbivores extends Animals{
      void eat(){
        System.out.println("They"+" "+eat+" "+"grass , plants");
      }
}

class Carnivores extends Animals{
    void eat(){
        System.out.println("They"+" "+eat+" "+"only meat");
    }
}