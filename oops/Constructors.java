public class Constructors {
    public static void main(String args[]){
         //Student stu = new Student();
         //Student stu1 = new Student("Utkarsh");

         Student s1 = new Student();
         s1.name = "utkarsh";
         s1.rollNo = "200143011998";
         s1.password = "A2020CS445";
         s1.marks[0] = 100;
         s1.marks[1] = 95;
         s1.marks[2] = 90;

         Student s2 = new Student(s1);

        s2.password = "A2020CS888";

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
       String name;
       String rollNo ;
       String password ;
       int marks[];
// Copy constructor
//Shallow Copy
 /* * Student(Student s1){
    this.name = name;
   this.rollNo = rollNo;
   this.marks = s1.marks;
  }*/


  //Deep copy
       Student(Student s1){
        marks = new int[3];
        this.name = name;
        this.rollNo = rollNo;
        for(int i=0;i<marks.length;i++){
             this.marks[i] = s1.marks[i];
        }
       }
    //Parametrized Constructor

    /*Student(String name){
            this.name = name;
            
    }*/

     // No-argument constructor or  non parametrized constructor
    Student(){
        marks = new int[3];
        System.out.println("Hello utkarsh Saxena");
    }


    // Default constructor which is created by compiler itself when it is not defined or create
}