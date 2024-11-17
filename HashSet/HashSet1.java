package HashSet;

import java.util.HashSet;

class Employee {
    String ename;
    int salary;

    public Employee(String ename, int salary) {
        super();
        this.ename = ename;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "ename='" + ename + '\'' + ", salary=" + salary + '}';
    }

    @Override
    public boolean equals(Object obj) {
        Employee e1 = (Employee) obj;
        if (e1.ename == this.ename && e1.salary == this.salary) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        //Convert all dataset type to String
        String strEname=ename;
        String strSalary=String.valueOf(salary);
        //Find out the hashcode
        int hashEname=strEname.hashCode();
        int hashSalary=strSalary.hashCode();
        int hash=0;
        hash=hash+hashEname+hashSalary;
        return hash;
    }

    public class HashSet1 {
        public static void main(String[] args) {
            HashSet gsv=new HashSet();
            Employee e1=new Employee("Kiran",45000);
            Employee e2=new Employee("Ravi",5000);
            Employee e3=new Employee("Kabeer",3000);
            Employee e4=new Employee("Kiran",45000);

            gsv.add(e1);
            gsv.add(e2);
            gsv.add(e3);
            gsv.add(e4);
            System.out.println(gsv);
            //HashSet do not store null since it is unordered
        }
    }
}