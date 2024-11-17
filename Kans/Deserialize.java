package Kans;

import java.io.*;

public class Deserialize {
    public static void main(String[] args) {
        File f1=null;
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try
        {
            f1 =new File("C:\\Users\\ASUS\\Desktop\\SEM-3\\JAVA\\KK.txt");
            fis=new FileInputStream(f1);
            ois= new ObjectInputStream(fis);
            Person p1=(Person)ois.readObject();
            System.out.println("Name "+p1.name);
            System.out.println("Age "+p1.age);
            System.out.println("Weight "+p1.weight);
            System.out.println("Aadhar "+p1.adha);
            System.out.println("PID "+p1.pid);
            System.out.println("Height "+p1.height);

        } catch (ClassNotFoundException e) {
        e.getMessage();
        }
        catch (IOException e){
            e.getMessage();
    }
    }
}
