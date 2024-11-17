package Kans;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.name="Amit Kumar";
        p1.age=34;
        p1.weight=89.5f;
        p1.height=5.9;
        p1.pid=111111;
        p1.adha=7437;
        File f1=null;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            f1 = new File("C:\\Users\\ASUS\\Desktop\\SEM-3\\JAVA\\KK.txt");
            fos =new FileOutputStream(f1);
            oos=new ObjectOutputStream(fos);
            oos.writeObject(p1);
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        finally {
            try{
                if (oos!=null){
                    oos.flush();
                    oos.close();
                    oos=null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
