package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable {
     String sname;
     int age;
     double mask;

     public Student(String sname, int age, double mask) {
         super();
         this.sname = sname;
         this.age = age;
         this.mask = mask;
     }

     public String toString() {
         return sname + " " + age + " " + mask;
     }
     public int compareTo(Object o){
         Student s=(Student) o;

         System.out.println(this.age-s.age);
         return (this.age-s.age);
     }
 }
    public class ArrayListStudent {
        public static void main(String[] args)
        {
            ArrayList da=new ArrayList();
            da.add(new Student("Ankit",23,67.8));
            da.add(new Student("Anu",28,77.8));
            da.add(new Student("Amit",53,32.33));
            da.add(new Student("BABU",19,99.9));
            Collections.sort(da);  //sorted using age
            System.out.println(da);

        }
    }

