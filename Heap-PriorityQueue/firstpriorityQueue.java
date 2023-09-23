import java.util.PriorityQueue;
public class firstpriorityQueue{

    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override 
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String args[]){
        //   PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        //   pq.add(8);
        //   pq.add(4);
        //   pq.add(6);
        //   pq.add(1);
        //   pq.add(3);
        //   pq.add(2);
        //   pq.add(5);
        //   pq.add(7);


        PriorityQueue<Student>pq = new PriorityQueue<>();

        pq.add(new Student("Utkarsh",10));
        pq.add(new Student("Amit",12));
        pq.add(new Student("Sumit",14));
        pq.add(new Student("Zayn",20));
        pq.add(new Student("Kajal",50));
        pq.add(new Student("Kirti",4));

          while(!pq.isEmpty()){
              System.out.println(pq.peek().name+" --> "+pq.peek().rank);
              pq.remove();
          }
    }
}